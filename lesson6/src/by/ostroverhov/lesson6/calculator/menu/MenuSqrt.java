package by.ostroverhov.lesson6.calculator.menu;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsOne;
import by.ostroverhov.lesson6.calculator.operations.Operations;
import by.ostroverhov.lesson6.calculator.operations.Sqrt;

public class MenuSqrt extends MenuCommonOperation implements MenuItem {
    public MenuSqrt(RootMenuItem rootMenu) {
        super(new Sqrt(), rootMenu);
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
        return "Sqrt";
    }
}
