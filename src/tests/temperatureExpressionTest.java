package tests;

import main.SumExpression;
import main.TempExpression;
import main.temperature.CelsiusTemp;
import main.temperature.FarenheitTemp;
import main.temperature.KelvinTemp;
import org.junit.Assert;
import org.junit.Test;

public class temperatureExpressionTest {
    @Test
    public void celsiusSum(){
        CelsiusTemp celsiusTemp = new CelsiusTemp(1);
        CelsiusTemp celsiusTempBis = new CelsiusTemp(1);
        TempExpression tempExpression = new TempExpression(celsiusTemp);
        TempExpression tempExpressionBis = new TempExpression(celsiusTempBis);


        SumExpression sumExpression = new SumExpression(tempExpression, tempExpressionBis);

        Assert.assertEquals(2, sumExpression.evaluate(),0.01);
    }

   @Test
    public void farenheitSum(){
        FarenheitTemp farenheitTemp = new FarenheitTemp(1);
        FarenheitTemp farenheitTempBis = new FarenheitTemp(1);
        TempExpression tempExpression = new TempExpression(farenheitTemp);
        TempExpression tempExpressionBis = new TempExpression(farenheitTempBis);


        SumExpression sumExpression = new SumExpression(tempExpression, tempExpressionBis);

        Assert.assertEquals(2, sumExpression.evaluate(),0.01);
    }
    @Test
    public void kelvinSum(){
        KelvinTemp kelvinTemp = new KelvinTemp(1);
        KelvinTemp kelvinTempBis = new KelvinTemp(1);
        TempExpression tempExpression = new TempExpression(kelvinTemp);
        TempExpression tempExpressionBis = new TempExpression(kelvinTempBis);


        SumExpression sumExpression = new SumExpression(tempExpression, tempExpressionBis);

        Assert.assertEquals(2, sumExpression.evaluate(),0.01);
    }
}
