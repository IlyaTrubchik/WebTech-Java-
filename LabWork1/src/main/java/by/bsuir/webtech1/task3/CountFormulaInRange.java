package by.bsuir.webtech1.task3;

import java.util.ArrayList;
import java.util.HashMap;

public class CountFormulaInRange {
    public static HashMap<Double,Double> count(double a, double b , double h){
        HashMap<Double,Double> hMap = new HashMap<>();
        if (a < b) {
            if (h > 0) {
                while(a  <= b){
                    hMap.put(a, Math.tan(a));
                    a = a + h;
                }
            } else {
                return hMap;
            }
        } else {
            if (h < 0) {
                while (a  >= b) {
                    hMap.put(a, Math.tan(a));
                    a = a + h;
                }
            } else {
                return hMap;
            }
        }
        return  hMap;
    }
}
