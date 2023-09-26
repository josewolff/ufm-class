package dataProviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider(name = "staticDP")
    public static Object[][] staticDP(){
        Object[][] obj = new Object[10][2];
        for(int x = 0; x < 10; x++){
            obj[x][0] = x;
            obj[x][1] = x *2;
        }
        return obj;
    }

    @DataProvider(name ="dynamicDP")
    public Iterator<Object[]> dynamicDP(){
        List<Object[]> data =  new ArrayList<Object[]>();
        for(int x = 0; x < 250; x++){
            data.add(new Object[]{x, x*2});
        }
        return data.iterator();
    }

}
