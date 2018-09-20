package by.ostroverhov.lesson6.calculator;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;
import by.ostroverhov.lesson6.calculator.operations.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCalculator {
    public static final Logger LOGGER = Logger.getLogger(SimpleCalculator.class.getName());

    Operations[] operations = {
            new Addition(),
            new Division(),
            new Multyply(),
            new Subtracnion(),
            new Exponent(),
            new Sqrt()
    };

    public void execute(int index, Operands operands) {
        try {
            System.out.println(operations[index].calculate(operands));
        } catch (OperandsBoundsException e) {
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }
    }
}
