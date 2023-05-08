package main.units;

public class Celsius implements MeasurementUnit {
    @Override
    public double convertToBaseUnit(double value) {
        return value;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        return value;
    }
}