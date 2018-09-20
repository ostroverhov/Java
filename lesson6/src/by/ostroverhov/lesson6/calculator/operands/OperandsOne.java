package by.ostroverhov.lesson6.calculator.operands;

public class OperandsOne implements Operands {
    double x;

    public OperandsOne(double x) {
        this.x = x;
    }

    @Override
    public double get(int index) {
        return x;
    }
}
