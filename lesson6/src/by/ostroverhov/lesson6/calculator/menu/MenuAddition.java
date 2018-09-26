package by.ostroverhov.lesson6.calculator.menu;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsTwo;
import by.ostroverhov.lesson6.calculator.operations.Addition;

public class MenuAddition extends MenuCommonOperation implements MenuItem {
    public MenuAddition(RootMenuItem rootMenu) {
        super(new Addition(), rootMenu);
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
        return "Addition";
    }
}
