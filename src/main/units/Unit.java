package main.units;

public class Unit {
    private final double value;
    private final MeasurementUnit unit;

    public Unit(double value, MeasurementUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public MeasurementUnit getUnit() {
        return unit;
    }

    public Unit convertTo(MeasurementUnit toUnit) {
        if (!this.unit.getClass().isInstance(toUnit)) {
            System.out.println("Unidades de medida incompatibles");
        }

        double valueInBaseUnit = this.unit.convertToBaseUnit(this.value);
        double convertedValue = toUnit.convertFromBaseUnit(valueInBaseUnit);
        return new Unit(convertedValue, toUnit);
    }
}