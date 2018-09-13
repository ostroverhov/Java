package by.ostroverhov.lesson5.shape;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void Calculation() {
        System.out.println("площадь прямоугольника: " + sideA * sideB);
    }
}
