package by.ostroverhov.lesson5.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.Calculation();

        Triangle triangle = new Triangle(3,4);
        triangle.Calculation();

        Square square = new Square(5);
        square.Calculation();

        Rectangle rectangle = new Rectangle(5,5);
        rectangle.Calculation();
    }
}
