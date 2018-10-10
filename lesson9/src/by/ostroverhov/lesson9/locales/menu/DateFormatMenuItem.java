package by.ostroverhov.lesson9.locales.menu;

import by.ostroverhov.lesson9.locales.DateFormats;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatMenuItem implements MenuItem{
    private RootMenuItem rootMenuItem;
    private Scanner scanner = new Scanner(System.in);
    private DateFormats dateFormats = new DateFormats();

    public DateFormatMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public void execute() {
        StringBuilder show = new StringBuilder("Выберите тип даты: \n");
        for (int i = 0; i < dateFormats.size(); i++) {
            show.append(i + 1).append(". ").append(dateFormats.get(i)).append("\n");
        }
        System.out.println(show);
        int choice = scanner.nextInt();

        Locale locale = rootMenuItem.getLocale();
        DateFormat fmt = DateFormat.getDateInstance(choice - 1, locale);
        Date currentDate = new Date();

        System.out.println(fmt.format(currentDate));
    }
}
