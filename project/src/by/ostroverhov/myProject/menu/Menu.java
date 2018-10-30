package by.ostroverhov.myProject.menu;

public class Menu {
    private MenuItemLocale root = new LocaleChoiceMenuItem();

    public void start() {
        root.execute();
    }
}
