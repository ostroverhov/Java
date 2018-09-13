package by.ostroverhov.lesson5.shape;

public class Triangle extends Shape {
    private double cathetusA;
    private double cathetusB;

    public Triangle(double cathetusA, double cathetusB) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    @Override
    void Calculation() {
        System.out.println("площадь треугольника: " + cathetusA * cathetusB / 2);
    }
}
