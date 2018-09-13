package by.ostroverhov.lesson5.shape;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void Calculation() {
        System.out.println("площадь квадрата: " + Math.pow(side, 2));
    }
}
