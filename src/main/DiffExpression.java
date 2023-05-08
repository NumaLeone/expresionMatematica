package main;

public class DiffExpression extends BinaryExpression {

    public DiffExpression(MathematicalExpression left, MathematicalExpression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
