package by.ostroverhov.lesson8;

import java.util.Scanner;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);

    private String text = SCANNER.next();
    private Object[] menu = {
            new SplitTextInList(text).splitTextInList(),
            new SplitTextInTreeSet(text).splitTextInTreeSet(),
            new CountWords(text).countWords(),
    };

    public void execute() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " " + menu[i].name());
        }
        SCANNER.nextInt();
    }
}
