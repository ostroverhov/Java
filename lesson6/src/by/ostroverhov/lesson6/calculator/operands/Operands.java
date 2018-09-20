package by.ostroverhov.lesson6.calculator.operands;

public interface Operands {
    double get(int index) throws OperandsBoundsException;
}
