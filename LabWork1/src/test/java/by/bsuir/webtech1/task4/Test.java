package by.bsuir.webtech1.task4;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class Test {

    @org.junit.Test
    public void forthTaskTests(){
        ArrayList<Integer> result;
        result = IsPrime.checkPrimeNumbers(new int[]{114,2,1243,12222,46,57,978,113,5436,8646});
        int[] expected = new int[] {2,8};
        int  i = 0;
        for(Integer res:result)
        {
            assertEquals((Integer) expected[i], res);
            i++;
        };
    }
}
