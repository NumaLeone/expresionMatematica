package main;

import main.temperature.Temp;

public class TempExpression implements MathematicalExpression{

    Temp temp;
    public TempExpression(Temp temp) {
        this.temp = temp;
    }

    @Override
    public double evaluate() {
        return temp.getTemp();
    }
}
