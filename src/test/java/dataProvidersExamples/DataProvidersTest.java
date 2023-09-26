package dataProvidersExamples;

import dataProviders.DataProviders;
import org.testng.annotations.Test;

public class DataProvidersTest {

    @Test(  groups = {"dynamicDP","all"},
            dataProvider = "dynamicDP",
            dataProviderClass = DataProviders.class)
    public void dpDynamicTest(int number1, int number2){
        System.out.println(number1 + "  " + number2);
    }
}
