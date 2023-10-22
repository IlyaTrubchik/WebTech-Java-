package by.bsuir.webtech1.task2;

import by.bsuir.webtech1.task1.FormulaProcess;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void secondTastTests()
    {
        boolean result = false;
        result = CheckIntersection.checkPoint(4,5);
        assertEquals(true,result);
        result = CheckIntersection.checkPoint(4.004,5.123);
        assertEquals(false,result);
        result = CheckIntersection.checkPoint(-5,1);
        assertEquals(false,result);
        result = CheckIntersection.checkPoint(-5,-1);
        assertEquals(true,result);
    }
}
