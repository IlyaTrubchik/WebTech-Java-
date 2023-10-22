package by.bsuir.webtech1.task3;

import by.bsuir.webtech1.IO.InputOutput;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void thirdTaskTests(){
        HashMap<Double,Double> result;
        result = CountFormulaInRange.count(1,10,1);

        double[] countedResult = new double[] {1.5574,-2.185,-0.1425,1.1578,-3.3805,-0.291,0.8714,-6.7997,-0.4523,0.6483};

        int  i = 0;
        for(Object key:result.keySet().stream().sorted().toArray())
        {
            assertEquals(countedResult[i],result.get(key),0.0001);
            i++;
        }

    }
}
