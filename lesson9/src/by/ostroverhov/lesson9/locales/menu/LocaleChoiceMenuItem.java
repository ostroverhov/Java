package by.ostroverhov.lesson9.locales.menu;

import by.ostroverhov.lesson9.locales.Locales;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleChoiceMenuItem implements MenuItem, RootMenuItem {
    private Locales locales = new Locales();
    private Scanner scanner = new Scanner(System.in);
    private MenuItem next = new DateFormatMenuItem(this);
    private Locale localeChoice;

    @Override
    public void execute() {
        StringBuilder show = new StringBuilder("выберите нужную локаль: \n");
        for (int i = 0; i < locales.size(); i++) {
            show.append(i + 1).append(". ").append(locales.get(i)).append('\n');
        }
        System.out.println(show.toString());

        int choice = scanner.nextInt();
        localeChoice = locales.get(choice - 1);
        ResourceBundle bundle = ResourceBundle.getBundle("resource", localeChoice);
        System.out.println(bundle.getString("hello"));

        next.execute();
    }

    @Override
    public Locale getLocale() {
        return localeChoice;
    }
}
