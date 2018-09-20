package by.ostroverhov.lesson6.calculator.operands;

public class OperandsTwo implements Operands {
    double x;
    double y;

    public OperandsTwo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double get(int index) throws OperandsBoundsException {
        if (index == 0)
            return x;
        else if (index == 1)
            return y;
        else
            throw new OperandsBoundsException("the index for Operands with two argument is not correct");
    }
}
