package by.ostroverhov.lesson6.calculator;

import by.ostroverhov.lesson6.calculator.operands.OperandsTwo;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.execute(0, new OperandsTwo(4,5));
    }
}
