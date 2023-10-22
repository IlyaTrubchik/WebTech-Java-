package by.bsuir.webtech1.task9;
public class Main {
    public static void main(String[] args) {
        Basket  basket =  new Basket(10);
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Gray));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Green));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.Red));
        basket.addBall(new Ball(1,Color.Blue));
        basket.addBall(new Ball(1,Color.White));
        basket.addBall(new Ball(1,Color.Blue));
        System.out.println(basket.countBlueBalls()
        );

    }
}
