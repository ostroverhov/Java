package by.ostroverhov.lesson5.shape;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void Calculation() {
        System.out.println("Площадь круга: " + PI * radius * radius);
    }
}
