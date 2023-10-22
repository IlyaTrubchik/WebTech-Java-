package by.bsuir.webtech1.task5;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void fifthTaskTests(){
        int result;
        result = IncreasingSequence.CountRemovingElements(new int[]{10,4,123,63,111,642,65,143,123,853});
        assertEquals(6,result);
    }
}
