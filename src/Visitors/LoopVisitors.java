package Visitors;

import MainPackage.*;
import static Visitors.Evaluator.insideFuncCall;
import static Visitors.Evaluator.ThrowError;

/** for and for each left */
public class LoopVisitors extends gebLBaseVisitor<Value>{
    @Override
    public Value visitWhileLoop(gebLParser.WhileLoopContext ctx){
        while (new DecisionalVisitors().visit(ctx.logicalExpression()).boolVal){
            Value val = new DecisionalVisitors().visit(ctx.decisionalAndLoopBlock());
            if(val.isReturn) { // If the statement is the result of a return statement and if is inside a func, returns it otherwise it throws an error
                if (insideFuncCall)
                    return val;
                else
                    ThrowError(5, ctx.start.getLine(), "", 0, 0);
            }
        }
        return new Value(); // If the while doesn't return anything
    }

    @Override
    public Value visitDoWhileLoop(gebLParser.DoWhileLoopContext ctx){
        do{
            Value val = new DecisionalVisitors().visit(ctx.decisionalAndLoopBlock());
            if(val.isReturn) { // If the statement is the result of a return statement and if is inside a func, returns it otherwise it throws an error
                if (insideFuncCall)
                    return val;
                else
                    ThrowError(5, ctx.start.getLine(), "", 0, 0);
            }
        }while (new DecisionalVisitors().visit(ctx.logicalExpression()).boolVal);
        return new Value(); // If the do while doesn't return anything
    }
}
