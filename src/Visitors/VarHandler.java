package Visitors;

import MainPackage.*;

import static Visitors.Evaluator.*;


public class VarHandler extends gebLBaseVisitor<Value>{

    /* This searches for a var in the vars lists and returns it. If the var can't be found it returns null*/
    public static Value findVar(String varName){
        if(!insideFuncCall){
            for(Value var : globalVars) if(var.strVal.equals(varName)) return var;
            for(int i = 0; i < localVars.size(); i++)
                for(int j = 0; j < localVars.get(i).size(); j++)
                    if(localVars.get(i).get(j).strVal.equals(varName)) return localVars.get(i).get(j);
        }else{
            for(int i = 0; i < localVars.size(); i++)
                for(int j = 0; j < localVars.get(i).size(); j++)
                    if(localVars.get(i).get(j).strVal.equals(varName)) return localVars.get(i).get(j);
            for(Value var : globalVars) if(var.strVal.equals(varName)) return var;
        }
        return null;
    }
    // This stores a given variable in the memory
    public static void storeVar(Value var){
        // If the program is evaluating a function call at the time, the variable is made local
        if(insideFuncCall) localVars.get(localLevel).add(var);
        else globalVars.add(var); // Otherwise, it's made global
    }

    @Override // This evaluates the expression, checks if the var exists, if it does, it just changes its num val, otherwise it creates and adds it to the memory
    public Value visitAssignvar(gebLParser.AssignvarContext ctx){
        Value var = new ExprVisitors().visit(ctx.operation());
        var.strVal = ctx.ID().getText();
        var.isReturn = false; // This is not a return for a function, however it is made false because the expression assigned to the var can be a return
        if(var.isVoid) // If the assigned expression is from a method that returns void, and error is being thrown and the program is being terminated
            ThrowError(6, ctx.start.getLine(), "", 0, 0);
        if(findVar(ctx.ID().getText()) != null){
            if(findVar(ctx.ID().getText()).isInt != var.isInt) // If the types of the current value and the value to be assigned are different it throws a warning
                ThrowWarning(1, ctx.start.getLine(), "");
            findVar(ctx.ID().getText()).numVal = var.numVal;
        }else{
            storeVar(var);
            newVar = true;
        }
        return var;
    }
    @Override // This allows use of +=, -=, *=, /=, %=
    public Value visitOperassign(gebLParser.OperassignContext ctx){
        Value val = findVar(ctx.ID().getText());
        Value value = new ExprVisitors().visit(ctx.operation());
        if(value.isVoid) // If the expression that is being assigned is func that returns void, the program throws and error
            ThrowError(6, ctx.start.getLine(), "", 0, 0);
        if(val != null && val.numVal != null){
            switch (ctx.op.getType()) {
                case gebLParser.MULTEQ -> val.numVal = val.getFloat() * value.getFloat();
                case gebLParser.DIVEQ -> val.numVal = val.getFloat() / value.getFloat();
                case gebLParser.MODEQ -> val.numVal = val.getFloat() % value.getFloat();
                case gebLParser.ADDEQ -> val.numVal = val.getFloat() + value.getFloat();
                case gebLParser.SUBEQ -> val.numVal = val.getFloat() - value.getFloat();
                default -> ThrowError(2, ctx.start.getLine(), "", 0, 0);}
            findVar(ctx.ID().getText()).numVal = val.numVal;
            return val;
        }
        return new Value();
    }
}
