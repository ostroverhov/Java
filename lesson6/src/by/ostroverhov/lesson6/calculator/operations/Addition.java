package by.ostroverhov.lesson6.calculator.operations;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;

public class Addition implements Operations {
    @Override
    public double calculate(Operands operands) throws OperandsBoundsException {
        return operands.get(0) + operands.get(2);
    }
}
