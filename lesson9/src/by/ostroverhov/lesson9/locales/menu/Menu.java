package by.ostroverhov.lesson9.locales.menu;

public class Menu {
    private MenuItem root = new LocaleChoiceMenuItem();

    public void start() {
        root.execute();
    }
}
