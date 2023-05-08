package main.units;

public class Kelvin implements MeasurementUnit {
    @Override
    public double convertToBaseUnit(double value) {
        return value - 273.15;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        return value + 273.15;
    }
}