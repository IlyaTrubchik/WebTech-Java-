package by.bsuir.webtech1.task9;


public class Ball {
    private int weight;
    private Color color;

    public Ball(int weight,Color color)
    {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
    public Color getColor(){
        return  this.color;
    }
}
