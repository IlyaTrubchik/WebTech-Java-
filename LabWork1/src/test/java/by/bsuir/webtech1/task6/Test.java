package by.bsuir.webtech1.task6;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void sixthTaskTests(){
        int[][] result;
        result = ProcessMatrix.process(new int[]{2,63,23,76,313,744,123});
        int[][] expectedMatrix = new int[][]{
                {2,63,23,76,313,744,123},
                {63,23,76,313,744,123,2},
                {23,76,313,744,123,2,63},
                {76,313,744,123,2,63,23},
                {313,744,123,2,63,23,76},
                {744,123,2,63,23,76,313},
                {123,2,63,23,76,313,744},};
        for(int i = 0;i<7;i++)
        {
            for(int j = 0;j<7;j++)
            {
                assertEquals(expectedMatrix[i][j],result[i][j]);
            }
        }
    }
}
