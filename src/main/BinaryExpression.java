package main;

import main.temperature.FarenheitTemp;

public abstract class BinaryExpression implements MathematicalExpression {

    MathematicalExpression left;
    MathematicalExpression right;
    public BinaryExpression(MathematicalExpression left, MathematicalExpression right){
        this.left = left;
        this.right = right;
    }

    public abstract double evaluate();

}
