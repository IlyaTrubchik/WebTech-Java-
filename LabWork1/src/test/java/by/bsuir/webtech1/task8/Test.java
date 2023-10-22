package by.bsuir.webtech1.task8;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void eighthTaskTests(){
        ArrayList<Integer> result;
        int[] expectedResult  =  new int[]{1,2,7,8,12,13,15,16,17,19};
        result = ProcessSequences.mergeSequences(new int[]{126,314,355,402,461,620,649,666,916,976},
                new int[]{188,240,596,605,732,828,927,929,937,977});
        for(int i = 0;i<result.size();i++)
        {
            assertEquals(expectedResult[i],(int)result.get(i));
        }
    }
}
