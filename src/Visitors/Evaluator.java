package Visitors;

import MainPackage.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluator extends gebLBaseVisitor<Value>{
    // This is used for creating local vars when inside a function
    public static boolean insideFuncCall = false;
    // This is true when a new var is created
    public static boolean newVar = false;
    // This is used for performing function calls
    //public Map<String, gebLParser.Func_defContext> functions = new HashMap<>();
    // This contains the function parameters upon call, and then it is emptied for the next func
    public static List<Value> funcParameters = new ArrayList<>();
    // Contains all the global vars stored so far in the program on compilation time
    public static List<Value> globalVars = new ArrayList<>();
    // Contains all the local vars stored so far in the program on compilation time
    public static HashMap<Integer, List<Value>> localVars = new HashMap<>();
    // This store the level of the block within which the var is declared
    public static int localLevel = 0;
    // TODO change all loops and decisionals (or curly blocks only) to increment the level when entered and decrement when left

    /**------------------------------------------CONSOLE TEXT COLORS------------------------------------------------*/

    public static final String RESET = "\033[0m";
    public static final String RED1 = "\033[4;31m";
    public static final String RED2 = "\033[0;31m";
    public static final String YELLOW1 = "\033[4;33m";
    public static final String YELLOW2 = "\033[0;33m";

    /**---------------------------------------------EVALUATOR METHODS--------------------------------------------------*/

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
            this.visit(ctx.struct(i));
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
            return new GebLMethods().visit(ctx.print());
        else return new Value();
    }
}