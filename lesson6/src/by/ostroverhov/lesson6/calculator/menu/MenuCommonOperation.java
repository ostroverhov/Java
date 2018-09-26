package by.ostroverhov.lesson6.calculator.menu;

import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;
import by.ostroverhov.lesson6.calculator.operations.Operations;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class MenuCommonOperation implements MenuItem {
    private static final Logger LOGGER = Logger.getLogger(MenuCommonOperation.class.getName());

    private static final Scanner SCANNER = new Scanner(System.in);

    private Operations operations;
    private RootMenuItem rootMenuItem;

    public MenuCommonOperation(Operations operations, RootMenuItem rootMenuItem) {
        this.operations = operations;
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public void execute() {
        double arguments[] = new double[operandsCount()];
        for (int i = 0; i < operandsCount(); i++) {
            System.out.println("введите операнд: ");
            arguments[i] = SCANNER.nextDouble();
        }

        try {
            Operands operandsTwo = operandsType(arguments);
            System.out.println(operations.calculate(operandsTwo));
        } catch (OperandsBoundsException e) {
            LOGGER.log(Level.INFO,e.getMessage(), e);
        }
        rootMenuItem.execute();
    }

    protected abstract int operandsCount();

    protected abstract Operands operandsType(double ... abc);
}
