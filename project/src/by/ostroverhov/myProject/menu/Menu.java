package by.ostroverhov.myProject.menu;

public class Menu {
    private MenuItem root = new LocaleChoiceMenuItem();

    public void start() {
        root.execute();
    }
}
