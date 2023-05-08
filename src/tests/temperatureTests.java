package tests;

import main.temperature.CelsiusTemp;
import main.temperature.FarenheitTemp;
import main.temperature.KelvinTemp;
import org.junit.Assert;
import org.junit.Test;

public class temperatureTests {

    @Test
    public void createCelsiusTemp(){
        CelsiusTemp celsiusTemp = new CelsiusTemp(1);
        Assert.assertEquals(1.0, celsiusTemp.getTemp(),0.001);
    }
    @Test
    public void createFarenheitTemp(){
        FarenheitTemp farenheitTemp = new FarenheitTemp(1);
        Assert.assertEquals(1.0, farenheitTemp.getTemp(), 0.001);
    }
    @Test
    public void createKelvinTemp(){
        KelvinTemp kelvinTemp = new KelvinTemp(1);
        Assert.assertEquals(1.0, kelvinTemp.getTemp(), 0.001);
    }

    @Test
    public void celsiusToKelvin(){
        CelsiusTemp celsiusTemp = new CelsiusTemp(1);
        KelvinTemp kelvinTemp = new KelvinTemp(274.15);

        Assert.assertEquals(kelvinTemp.getTemp(), new KelvinTemp(celsiusTemp).getTemp(), 0.01);
    }
    @Test
    public void farenheitToKelvin(){
        FarenheitTemp farenheitTemp = new FarenheitTemp(1);
        KelvinTemp kelvinTemp = new KelvinTemp(255.928);
        Assert.assertEquals(kelvinTemp.getTemp(), new KelvinTemp(farenheitTemp).getTemp(), 0.01);
    }
    @Test
    public void kelvinToCelsius(){
        KelvinTemp kelvinTemp = new KelvinTemp(1);
        CelsiusTemp celsiusTemp = new CelsiusTemp(-272.15);

        Assert.assertEquals(celsiusTemp.getTemp(), new CelsiusTemp(kelvinTemp).getTemp(), 0.01);
    }
    @Test
    public void farenheitToCelsius(){
        FarenheitTemp farenheitTemp = new FarenheitTemp(1);
        CelsiusTemp celsiusTemp = new CelsiusTemp(-17.2222);
        Assert.assertEquals(celsiusTemp.getTemp(), new CelsiusTemp(farenheitTemp).getTemp(), 0.01);
    }

    @Test
    public void celsiusToFarenheit(){
        CelsiusTemp celsiusTemp = new CelsiusTemp(1);
        FarenheitTemp farenheitTemp = new FarenheitTemp(33.8);

        Assert.assertEquals(farenheitTemp.getTemp(), new FarenheitTemp(celsiusTemp).getTemp(), 0.01);
    }

    @Test public void kelvinToFarenheit(){
        KelvinTemp kelvinTemp = new KelvinTemp(1);
        FarenheitTemp farenheitTemp = new FarenheitTemp(-457.87);

        Assert.assertEquals(farenheitTemp.getTemp(), new FarenheitTemp(kelvinTemp).getTemp(), 0.01);
    }

    @Test public void kelvinToKelvin() {
        KelvinTemp kelvinTemp = new KelvinTemp(1);
        KelvinTemp kelvinTempBis = new KelvinTemp(1);

        Assert.assertEquals(kelvinTempBis.getTemp(), new KelvinTemp(kelvinTemp).getTemp(), 0.01);
    }

    @Test public void celsiusToCelsius() {
        CelsiusTemp celsiusTemp = new CelsiusTemp(1);
        CelsiusTemp celsiusTempBis = new CelsiusTemp(1);

        Assert.assertEquals(celsiusTempBis.getTemp(), new CelsiusTemp(celsiusTemp).getTemp(), 0.01);
    }

    @Test public void farenheitToFarenheit() {
        FarenheitTemp farenheitTemp = new FarenheitTemp(1);
        FarenheitTemp farenheitTempBis = new FarenheitTemp(1);

        Assert.assertEquals(farenheitTempBis.getTemp(), new FarenheitTemp(farenheitTemp).getTemp(), 0.01);
    }
}
