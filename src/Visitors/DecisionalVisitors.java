package Visitors;

import MainPackage.*;
import static Visitors.Evaluator.insideFuncCall;
import static Visitors.Evaluator.ThrowError;

public class DecisionalVisitors extends gebLBaseVisitor<Value>{
    @Override // This visits the if/elseif/else statements and checks their conditions
    public Value visitIfStatement(gebLParser.IfStatementContext ctx){
        boolean evalElse = true;
        // This checks the if and else if's.
        for (int i = 0; i < ctx.logicalExpression().size(); i++) {
            if (this.visit(ctx.logicalExpression(i)).boolVal) {
                evalElse = false;
                Value val = this.visit(ctx.decisionalAndLoopBlock(i));
                if (val.isReturn) { // If the statement is the result of a return statement and if is inside a fun, returns it otherwise it throws an error
                    if (insideFuncCall)
                        return val;
                    else
                        ThrowError(5, ctx.start.getLine(), "", 0, 0);
                }
                break;
            }
        }
        // This checks else.
        if (ctx.ELSE() != null && evalElse){
            Value val = this.visit(ctx.decisionalAndLoopBlock(ctx.decisionalAndLoopBlock().size() - 1));
            if (val.isReturn) { // If the statement is the result of a return statement and if is inside a fun, returns it otherwise it throws an error
                if (insideFuncCall)
                    return val;
                else
                    ThrowError(5, ctx.start.getLine(), "", 0, 0);
            }
        }
        return new Value();
    }

    @Override
    public Value visitLogicalExpression(gebLParser.LogicalExpressionContext ctx){
        boolean prev;
        if(ctx.comparisonExpression().size() == 1)
            return new ExprVisitors().visit(ctx.comparisonExpression(0));
        else
        {
            prev = new ExprVisitors().visit(ctx.comparisonExpression(0)).boolVal;
            for(int i = 1; i < ctx.comparisonExpression().size(); i++) {
                switch (ctx.op.getType()) {
                    case (gebLParser.AND) -> {
                        prev = prev && new ExprVisitors().visit(ctx.comparisonExpression(i)).boolVal;
                        if(i == ctx.comparisonExpression().size() - 1)
                            return new Value(prev);
                    }
                    case (gebLParser.OR) -> {
                        prev = prev || new ExprVisitors().visit(ctx.comparisonExpression(i)).boolVal;
                        if(i == ctx.comparisonExpression().size() - 1)
                            return new Value(prev);
                    }default -> { Evaluator.ThrowError(2, ctx.start.getLine(), "", 0, 0); return new Value();}
                }
            }
        }
        return new Value(false);
    }

    /*    @Override
        public Value visitSwitchStatement(gebLParser.SwitchStatementContext ctx){
            Value val = new ExprVisitors().visit(ctx.operation(0));
            var value = val.isInt ? val.numVal :
            switch (){

            }
            return new Value();
        }*/
    @Override // This visits the statements inside the if/elseif/else and switch cases
    public Value visitDecisionalAndLoopBlock(gebLParser.DecisionalAndLoopBlockContext ctx){
        for(int i = 0; i < ctx.struct().size(); i++){
            Value val = new Evaluator().visit(ctx.struct(i));
            if(val.isReturn) // If the statement is the result of a return statement and if is inside a fun, returns it otherwise it throws an error
                if (insideFuncCall) return val;
                else ThrowError(5, ctx.start.getLine(), "", 0, 0);
        }
        return new Value();
    }
}
