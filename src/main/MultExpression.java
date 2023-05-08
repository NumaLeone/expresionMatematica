package main;

public class MultExpression extends BinaryExpression{
    public MultExpression(MathematicalExpression left, MathematicalExpression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate()*right.evaluate();
    }
}
