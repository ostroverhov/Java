package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleChoiceMenuItem implements MenuItemLocale, RootMenuItem {
    private Locales locales = new Locales();
    private Scanner scanner = new Scanner(System.in);
    private MenuItemLocale next =  new OperationChoiceMenuItem(this);
    private Locale localeChoice;


    @Override
    public void execute(List<Drug> ourDrug) {
        StringBuilder show = new StringBuilder("Выберите язык:");
        for (int i = 0; i < locales.size(); i++) {
            show.append("\n").append(i + 1).append(". ").append(locales.get(i));
        }
        System.out.println(show.toString());

        int choice = scanner.nextInt();
        localeChoice = locales.get(choice - 1);
        ResourceBundle bundle = ResourceBundle.getBundle("resource", localeChoice);
        System.out.println(bundle.getString("hello"));

        next.execute(ourDrug);
    }

    @Override
    public String localeMenu() {
        return null;
    }

    @Override
    public Locale getLocale() {
        return localeChoice;
    }
}
