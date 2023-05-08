package main.temperature;

public class FarenheitTemp extends Temp {
    public FarenheitTemp(double temp) {
        super(temp);
    }

    public FarenheitTemp(Temp temp) {
        super(temp);
    }

    public FarenheitTemp(CelsiusTemp celsiusTemp) {
        super((celsiusTemp.getTemp() * (9.0/5) ) + 32);
    }

    public FarenheitTemp(KelvinTemp kelvinTemp) {
        super((kelvinTemp.getTemp() -273.15) * (9.0/5) + 32);
    }
}
