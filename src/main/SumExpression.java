package main;

public class SumExpression extends BinaryExpression{
    public SumExpression(MathematicalExpression left, MathematicalExpression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
