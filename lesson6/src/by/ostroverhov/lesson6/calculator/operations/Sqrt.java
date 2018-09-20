package by.ostroverhov.lesson6.calculator.operations;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;

public class Sqrt implements Operations {
    @Override
    public double calculate(Operands operands) throws OperandsBoundsException {
        return Math.sqrt(operands.get(0));
    }
}
