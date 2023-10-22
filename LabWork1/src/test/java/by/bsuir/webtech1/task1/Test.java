package by.bsuir.webtech1.task1;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void  firstTaskTests(){
        double result = 0;
        result = FormulaProcess.countFormula(4,5);
        assertEquals(4.1956,result,0.0001);
        result = FormulaProcess.countFormula(12,95);
        assertEquals(12.0738,result,0.0001);
        result = FormulaProcess.countFormula(0.05,1.124);
        assertEquals(0.9988,result,0.0001);
        result = FormulaProcess.countFormula(0.123,0.123);
        assertEquals(0.6873,result,0.0001);
    }
}
