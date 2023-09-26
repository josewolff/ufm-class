package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import unitTestExample.Calculator;

public class Calculadora {

    @Test
    public void suma(){
        double expectedResult = 4.5;
        Calculator suma = new Calculator();
        double result =  suma.sum(2,2.5);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void rest(){
        double expectedResult = 0.5;
        Calculator calculator = new Calculator();
        double result = calculator.resta(10.5, 10);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void div(){
        double expectedResult = 2;
        Calculator calculator = new Calculator();
        double result = calculator.div(4, 2);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void div2(){
        double expectedResult = -1;
        Calculator calculator = new Calculator();
        double result = calculator.div(4, 0);
        Assert.assertEquals(expectedResult,result);
    }
}
