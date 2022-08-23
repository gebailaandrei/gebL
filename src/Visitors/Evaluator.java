package Visitors;

import MainPackage.*;
import java.util.ArrayList;
import java.util.List;

public class Evaluator extends gebLBaseVisitor<Value>{

    public static boolean insideFuncCall = false; // This is used for creating local vars when inside a function
    public static boolean newVar = false; // This is true when a new var is created
    //public Map<String, gebLParser.Func_defContext> functions = new HashMap<>(); // This is used for performing function calls
    public static List<Value> funcParameters = new ArrayList<>(); // This contains the function parameters upon call, and then it is emptied for the next func
    public static List<Value> globalVars = new ArrayList<>(); // Contains all the global vars stored so far in the program on compilation time
    public static List<Value> localVars = new ArrayList<>(); // Contains all the local vars stored so far in the program on compilation time
    /**------------------------------------------CONSOLE TEXT COLORS------------------------------------------------*/
    public static final String RESET = "\033[0m";
    public static final String RED1 = "\033[4;31m";
    public static final String RED2 = "\033[0;31m";
    public static final String YELLOW1 = "\033[4;33m";
    public static final String YELLOW2 = "\033[0;33m";
    /**---------------------------------------------HELPER METHODS--------------------------------------------------*/
    /* This searches for a var in the vars lists and returns it. If the var can't be found it returns null*/
    public static Value findVar(String varName, int line){
        if(!insideFuncCall){
            for(Value var : globalVars) if(var.strVal.equals(varName)) return var;
            for(Value var : localVars) if(var.strVal.equals(varName)) return var;
        }else{
            for(Value var : localVars) if(var.strVal.equals(varName)) return var;
            for(Value var : globalVars) if(var.strVal.equals(varName)) return var;
        }
        return null;
    }
    // This stores a given variable in the memory
    public static void storeVar(Value var){
        if(insideFuncCall) localVars.add(var); // If the program is evaluating a function call at the time, the variable is made loca
        else globalVars.add(var); // Otherwise, it's made global
    }
    // This throws errors in the console and terminates the program
    public static void ThrowError(int type, int line, String name, int size1, int size2){
        switch (type){
            case(1) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " There's no variable \"" + name + "\" declared." + RESET);
            case(2) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " Operator mismatch." + RESET);
            case(3) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " Function \"" + name + "\" has not been defined.");
            case(4) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " Function \"" + name + "\" requires " + size1 + " parameters when called (" + size2 + " were supplied).");
            case(5) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " Return statements can only be used within functions.");
            case(6) -> System.out.println(RED1 + "ERROR(line " + line + "):" + RED2 + " Function returns void.");
        }
        System.exit(0);
    }
    // This throws warnings in the console and doesn't terminate the program
    public static void ThrowWarning(int type, int line, String name){
        switch (type){
            case(1) -> System.out.println(YELLOW1 + "WARNING(line " + line + "):" + YELLOW2 + " Type mismatch." + RESET);
        }
    }

    /**------------------------------------------------VISIT METHODS---------------------------------------------------**/
    @Override
    public Value visitList(gebLParser.ListContext ctx){
        for(int i = 0; i < ctx.struct().size(); i++)
        {
            this.visit(ctx.struct(i));
        }

        return new Value();
    }

    @Override
    public Value visitStruct(gebLParser.StructContext ctx){
        if(ctx.varHandler() != null)
            return new VarHandler().visit(ctx.varHandler());
        else if(ctx.decisionalStatements() != null)
            return new DecisionalVisitors().visit(ctx.decisionalStatements());
        else if(ctx.loopStatements() != null)
            return new LoopVisitors().visit(ctx.loopStatements());
        else if(ctx.print() != null)
            return this.visit(ctx.print());
        else return new Value();
    }

    @Override // This prints whatever is passed to the print method
    public Value visitPrint(gebLParser.PrintContext ctx){
        Value expr = new ExprVisitors().visit(ctx.operation()); // The expression that is to be printed, can be a number, the val of a var, the return of a function or a string
        if (expr.strVal == null){ // If it is a number that needs to be printed
            if(expr.getFloat().intValue() == expr.getFloat()) // Checks whether it is an int or a float and prints it
                System.out.println(expr.getFloat().intValue());
            else
                System.out.println(expr.getFloat());
        }else{ // If it is not a number it can either be a string or a var who's val needs to be printed
            Value val = Evaluator.findVar(expr.strVal, ctx.start.getLine());
            if(val != null){ // If it is a var
                if(val.getFloat().intValue() == val.getFloat()) // Checks whether it is an int or a float and prints it
                    System.out.println(val.getFloat().intValue());
                else
                    System.out.println(val.getFloat());
            }else if(expr.isReturn) { // If it is the return of a function, prints the value of it
                if(expr.getFloat().intValue() == expr.getFloat()) // Checks whether it is an int or a float and prints it
                    System.out.println(expr.getFloat().intValue());
                else
                    System.out.println(expr.getFloat());
            }else // Otherwise, it's a string and it prints it
                System.out.println(expr.strVal.replace("\"", ""));
        }
        return new Value();
    }
}