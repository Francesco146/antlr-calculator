import java.util.HashMap;

public class Es1 extends es1BaseVisitor<Integer> {
    HashMap<String, Integer> varMap = new HashMap<>();

    @Override
    public Integer visitMain(es1Parser.MainContext ctx) {
        return visit(ctx.commands());
    }

    @Override
    public Integer visitExpression(es1Parser.ExpressionContext ctx) {

        return visit(ctx.exp());
    }

    @Override
    public Integer visitDeclaration(es1Parser.DeclarationContext ctx) {
        varMap.put(ctx.VAR().getText(), visit(ctx.exp()));

        return visit(ctx.commands());
    }

    @Override
    public Integer visitVar(es1Parser.VarContext ctx) {
        return varMap.getOrDefault(ctx.getText(), 0);
    }


    @Override
    public Integer visitPlus(es1Parser.PlusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left + right;
    }

    @Override
    public Integer visitMul(es1Parser.MulContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left * right;
    }

    @Override
    public Integer visitDiv(es1Parser.DivContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        if (right == 0)
            throw new IllegalArgumentException("Cannot divide by 0");

        return left / right;
    }

    @Override
    public Integer visitMinus(es1Parser.MinusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left - right;
    }

    @Override
    public Integer visitInt(es1Parser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitMod(es1Parser.ModContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left % right;
    }
}