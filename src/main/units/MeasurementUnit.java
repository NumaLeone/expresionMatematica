package main.units;

public interface MeasurementUnit {
    double convertToBaseUnit(double value);
    double convertFromBaseUnit(double value);
}