package Visitors;

import MainPackage.gebLBaseVisitor;
import MainPackage.gebLParser;

public class GebLMethods extends gebLBaseVisitor<Value> {

    @Override // This prints whatever is passed to the print method
    public Value visitPrint(gebLParser.PrintContext ctx){
        Value expr = new ExprVisitors().visit(ctx.operation()); // The expression that is to be printed, can be a number, the val of a var, the return of a function or a string
        if (expr.strVal == null){ // If it is a number that needs to be printed
            if(expr.getFloat().intValue() == expr.getFloat()) // Checks whether it is an int or a float and prints it
                System.out.println(expr.getFloat().intValue());
            else
                System.out.println(expr.getFloat());
        }else{ // If it is not a number it can either be a string or a var who's val needs to be printed
            Value val = VarHandler.findVar(expr.strVal);
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
