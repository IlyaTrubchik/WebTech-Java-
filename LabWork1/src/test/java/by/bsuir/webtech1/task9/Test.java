package by.bsuir.webtech1.task9;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void ninthTaskTests(){
        Basket basket =  new Basket(10);
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Black));
        basket.addBall(new Ball(1,Color.Green));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Red));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Purple));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        assertEquals(6,basket.countBlueBalls());
    }
}
