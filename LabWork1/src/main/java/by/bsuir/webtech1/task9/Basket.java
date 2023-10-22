package by.bsuir.webtech1.task9;

import java.util.ArrayList;
import by.bsuir.webtech1.task9.Color;
public class Basket {
    private static final int DEFAULT_CAPACITY = 50;
    private int capacity;
    private int currentWeight;
    private ArrayList<Ball> balls;

    public Basket(){
        balls =  new ArrayList<Ball>(DEFAULT_CAPACITY);
        this.capacity = DEFAULT_CAPACITY;
        this.currentWeight = 0;
    }
    public Basket (int capacity)
    {
        balls =  new ArrayList<Ball>(capacity);
        this.capacity = capacity;
        this.currentWeight = 0;
    }
    public boolean addBall(Ball ball) {
        if(ball == null)
        {
            return  false;
        }
        if(currentWeight+ball.getWeight()<=capacity)
        {
            balls.add(ball);
            currentWeight +=ball.getWeight();
            return  true;
        }
        else
        {
            return false;
        }
    }
    public int countBlueBalls(){
        int count = 0;
        for(Ball ball:balls)
        {
            if((ball.getColor()).equals(Color.Blue))
            {
                count++;
            }
        }
        return  count;
    }
    public int getCurrentWeight()
    {
        return this.currentWeight;
    }
}
