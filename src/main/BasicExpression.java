package main;
public class BasicExpression implements MathematicalExpression {
    int expression;

    public BasicExpression(int expression){
     this.expression = expression;
    }

    @Override
    public double evaluate() {
        return expression;
    }
}
