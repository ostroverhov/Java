package by.ostroverhov.lesson6.calculator.menu;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsOne;
import by.ostroverhov.lesson6.calculator.operations.Exponent;
import by.ostroverhov.lesson6.calculator.operations.Operations;

public class MenuExponent extends MenuCommonOperation implements MenuItem {
    public MenuExponent(RootMenuItem rootMenu) {
        super(new Exponent(), rootMenu);
    }

    @Override
    protected int operandsCount() {
        return 1;
    }

    @Override
    protected Operands operandsType(double... a) {
        return new OperandsOne(a[0]);
    }

    @Override
    public String name() {
        return "Exponent";
    }
}
