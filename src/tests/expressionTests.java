package tests;

import main.*;
import org.junit.Assert;
import org.junit.Test;

public class expressionTests {

    @Test
    public void evaluateBasicExpression(){
        BasicExpression basic = new BasicExpression(1);

        Assert.assertEquals(1, basic.evaluate(),0);
    }

    @Test
    public void evaluateSumExpression(){
        SumExpression sumExpression = new SumExpression(new BasicExpression(1),new SumExpression(new BasicExpression(1),new BasicExpression(1)));

        Assert.assertEquals(3, sumExpression.evaluate(),0.01);
    }
    @Test
    public void evaluateDiffExpression(){
        DiffExpression DiffExpression = new DiffExpression(new BasicExpression(1),new BasicExpression(2));

        Assert.assertEquals(-1, DiffExpression.evaluate(),0.01);
    }
    @Test
    public void evaluateMultExpression(){
        MultExpression multExpression = new MultExpression(new BasicExpression(2),new BasicExpression(3));
        Assert.assertEquals(6,multExpression.evaluate(),0.01);
    }

    @Test
    public void evaluateDivExpression(){
        DivExpression divExpression = new DivExpression(new BasicExpression(7),new BasicExpression(2));
        Assert.assertEquals(3.5,divExpression.evaluate(),0.01);
    }

    @Test
    public void evaluateCompoundExpression(){
        DiffExpression firstExpression = new DiffExpression(new BasicExpression(10), new BasicExpression(4));
        SumExpression secondExpression = new SumExpression(firstExpression, new BasicExpression(1));
        SumExpression thirdExpression = new SumExpression(new BasicExpression(1), new BasicExpression(9));

        MultExpression parenthesisExpression = new MultExpression(secondExpression,thirdExpression);

        MultExpression finalExpression = new MultExpression(parenthesisExpression, new BasicExpression(1));

        Assert.assertEquals(70, finalExpression.evaluate(),0.01);

    }



}
