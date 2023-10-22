package by.bsuir.webtech1.task4;

import java.util.ArrayList;

public class IsPrime {
    public static ArrayList<Integer> checkPrimeNumbers(int[] numbers){
        ArrayList<Integer> nums =  new ArrayList<>();
        for(int i = 0;i<numbers.length;i++)
        {
           if(checkOnPrime(numbers[i]))
           {
               nums.add(i+1);
           }
        }
        return  nums;
    }
    public static boolean checkOnPrime(int number){
        if(number<2)
        {
            return false;
        }else if(number == 2)
        {
            return  true;
        }
        for(int i = 2;i<=Math.sqrt(number);i++)
        {
            if(number % i == 0)
                return false;
        }
        return  true;
    }
}
