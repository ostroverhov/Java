package by.ostroverhov.myProject.menu;

import java.util.Locale;
import java.util.ResourceBundle;

public class MenuOutputDrug implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuOutputDrug(RootMenuItem rootMenu) {
        this.rootMenuItem = rootMenu;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("outputDrug");
    }

    @Override
    public void execute() {

    }
}
