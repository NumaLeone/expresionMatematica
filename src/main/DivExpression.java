package main;

public class DivExpression extends BinaryExpression{
    public DivExpression(MathematicalExpression left, MathematicalExpression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate()/right.evaluate();
    }
}
