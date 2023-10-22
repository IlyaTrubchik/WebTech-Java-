package by.bsuir.webtech1.task7;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void seventhTaskTests(){
        int[] result = ArraySorting.sort(new int[]{923,986, 513 ,773, 824, 526, 439 ,534, 198, 534 ,
                629 ,670, 589, 8 ,917 ,663, 91 ,105, 548, 573});
        int[] expectedResult =  new int[] {8,91,105,198,439,513,526,534,534,548,573,589,629,663,670,773,824,917,923,986};
        for(int  i = 0;i<result.length;i++)
        {
            assertEquals(expectedResult[i],result[i]);
        }
    }
}
