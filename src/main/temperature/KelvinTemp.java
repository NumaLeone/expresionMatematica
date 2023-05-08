package main.temperature;

public class KelvinTemp extends Temp {

    public KelvinTemp(double temp) {
        super(temp);
    }

    public KelvinTemp(Temp temp) {
        super(temp);
    }

    public KelvinTemp(CelsiusTemp celsiusTemp) {
        super(celsiusTemp.getTemp() + 273.15);
    }
    public KelvinTemp(FarenheitTemp farenheitTemp) {
       super((farenheitTemp.getTemp()-32) * (5.0/9) + 273.15);
    }
}
