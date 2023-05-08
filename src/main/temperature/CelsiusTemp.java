package main.temperature;

public class CelsiusTemp extends Temp {

    public CelsiusTemp(double temp) {
        super(temp);
    }

    public CelsiusTemp(Temp temp) {
        super(temp);
    }

    public CelsiusTemp(KelvinTemp kelvinTemp) {
        super(kelvinTemp.getTemp() - 273.15);
    }

    public CelsiusTemp(FarenheitTemp farenheitTemp) {
        super((farenheitTemp.getTemp() - 32) * (5.0/9));
    }
}
