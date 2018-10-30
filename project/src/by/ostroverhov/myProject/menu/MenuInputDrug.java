package by.ostroverhov.myProject.menu;

import java.util.Locale;
import java.util.ResourceBundle;

public class MenuInputDrug implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuInputDrug(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("inputDrug");
    }

    @Override
    public void execute() {

    }
}
