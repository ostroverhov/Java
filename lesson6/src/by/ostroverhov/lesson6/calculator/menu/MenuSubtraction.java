package by.ostroverhov.lesson6.calculator.menu;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsTwo;
import by.ostroverhov.lesson6.calculator.operations.Operations;
import by.ostroverhov.lesson6.calculator.operations.Subtraction;

public class MenuSubtraction extends MenuCommonOperation implements MenuItem {
    public MenuSubtraction(RootMenuItem rootMenu) {
        super(new Subtraction(), rootMenu);
    }

    @Override
    protected int operandsCount() {
        return 2;
    }

    @Override
    protected Operands operandsType(double... a) {
        return new OperandsTwo(a[0], a[1]);
    }

    @Override
    public String name() {
        return "Subtraction";
    }
}
