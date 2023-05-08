package main.units;

public class Temperature {
    private final double value;
    private final MeasurementUnit unit;

    public Temperature(double value, MeasurementUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public MeasurementUnit getUnit() {
        return unit;
    }

    public Temperature convertTo(MeasurementUnit toUnit) {
        if (!this.unit.getClass().isInstance(toUnit)) {
            System.out.println("Unidades de medida incompatibles");
        }

        double valueInBaseUnit = this.unit.convertToBaseUnit(this.value);
        double convertedValue = toUnit.convertFromBaseUnit(valueInBaseUnit);
        return new Temperature(convertedValue, toUnit);
    }
}
