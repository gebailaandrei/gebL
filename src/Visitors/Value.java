package Visitors;

import MainPackage.*;
import java.util.Objects;

public class Value{
    Object numVal; // Visitors.Value of the var
    String strVal; // Name of the var
    boolean boolVal; // For storing boolean values
    int type = 0;
    boolean isInt = false; // Whether it's an int or a float
    boolean isReturn = false; // Used to tell if the Visitors.Value is returned by a function or not
    boolean isVoid = false; // Used for when a function returns void

    public Value(){}
    public Value(Float val){
        if(val.intValue() == val)
            isInt = true;
        this.numVal = val;
    }
    public Value(boolean val)
    {
        this.boolVal = val;
    }
    public Value(String val){ this.strVal = val;}
    public Float getFloat(){
        if(isInt && numVal instanceof Integer)
            return Float.valueOf((Integer)numVal);
        else
            return (Float) numVal;
    }

    public Value compareTo(Value other, gebLParser.ComparisonExpressionContext ctx)
    {
        switch (ctx.op.getType()) {
            case gebLParser.GT -> {return new Value(this.getFloat() > other.getFloat());}
            case gebLParser.GTOE -> {return new Value(this.getFloat() >= other.getFloat());}
            case gebLParser.LT -> {return new Value(this.getFloat() < other.getFloat());}
            case gebLParser.LTOE -> {return new Value(this.getFloat() <= other.getFloat());}
            case gebLParser.EQ -> {return new Value(Objects.equals(this.getFloat(), other.getFloat()));}
            case gebLParser.NEQ -> {return new Value(!Objects.equals(this.getFloat(), other.getFloat()));}
            default -> { Evaluator.ThrowError(2, ctx.start.getLine(), "", 0, 0); return new Value();}}
    }
}