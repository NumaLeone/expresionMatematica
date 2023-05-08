package main.units;

public class Fahrenheit implements MeasurementUnit {
    @Override
    public double convertToBaseUnit(double value) {
        return (value - 32.0) * 5.0 / 9.0;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        return value * 9.0 / 5.0 + 32.0;
    }
}
