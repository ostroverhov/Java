package by.ostroverhov.lesson6.calculator.menu;

import java.util.Scanner;

public class MenuDisplay implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenu = {
            new MenuAddition(this),
            new MenuDivision(this),
            new MenuMultiply(this),
            new MenuSubtraction(this),
            new MenuSqrt(this),
            new MenuExponent(this),
    };

    @Override
    public void execute() {
        for (int i = 0; i < subMenu.length; i++) {
            System.out.println(i + " " + subMenu[i].name());
        }
        subMenu[SCANNER.nextInt()].execute();
    }
}
