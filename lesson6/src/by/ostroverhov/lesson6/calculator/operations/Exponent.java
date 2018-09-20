package by.ostroverhov.lesson6.calculator.operations;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;

public class Exponent implements Operations {
    @Override
    public double calculate(Operands operands) throws OperandsBoundsException {
        return Math.exp(operands.get(0));
    }
}
