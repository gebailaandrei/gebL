package Visitors;

import MainPackage.*;
import java.util.Objects;

public class ExprVisitors extends gebLBaseVisitor<Value>{

    @Override
    public Value visitString(gebLParser.StringContext ctx){
        return new Value(ctx.STRING_VAL().getText());
    }

    @Override
    public Value visitNum(gebLParser.NumContext ctx){
        Value value = new Value(Float.parseFloat(ctx.NUM().getText()));
        if(value.getFloat().intValue() == value.getFloat())
            value.isInt = true;
        return value;
    }

    @Override
    public Value visitId(gebLParser.IdContext ctx){
        Value var = new Value();
        Value val = VarHandler.findVar(ctx.ID().getText());
        if(val == null)
            Evaluator.ThrowError(1, ctx.start.getLine(), ctx.ID().getText(), 0, 0);
        else{
            var.numVal = val.numVal;
            var.isInt = val.isInt;
            var.isReturn = val.isReturn;
        }
        return var;
    }

    @Override
    public Value visitParenthesis(gebLParser.ParenthesisContext ctx){
        return this.visit(ctx.operation());
    }

    @Override
    public Value visitMultOp(gebLParser.MultOpContext ctx){
        Value l = this.visit(ctx.operation(0)), r = this.visit(ctx.operation(1));
        switch (ctx.op.getType()) {
            case gebLParser.MULT -> { return new Value(l.getFloat() * r.getFloat());}
            case gebLParser.DIV  -> { return new Value(l.getFloat() / r.getFloat());}
            case gebLParser.MOD  -> { return new Value(l.getFloat() % r.getFloat());}
            default ->              { Evaluator.ThrowError(2, ctx.start.getLine(), "", 0, 0); return new Value();}}
    }

    @Override
    public Value visitAddOp(gebLParser.AddOpContext ctx){
        Value l = this.visit(ctx.operation(0)), r = this.visit(ctx.operation(1));
        switch (ctx.op.getType()) {
            case gebLParser.ADD -> { return new Value(l.getFloat() + r.getFloat()); }
            case gebLParser.SUB -> { return new Value(l.getFloat() - r.getFloat()); }
            default ->             { Evaluator.ThrowError(2, ctx.start.getLine(), "", 0, 0); return new Value();}}
    }

    @Override
    public Value visitComparisonExpression(gebLParser.ComparisonExpressionContext ctx){
        Value l = this.visit(ctx.operation(0)), r = this.visit(ctx.operation(1));
        return l.compareTo(r, ctx);
    }
}
