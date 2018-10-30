package by.ostroverhov.myProject.menu;

import java.util.Locale;
import java.util.ResourceBundle;

public class MenuStatistic6MonthAgo implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuStatistic6MonthAgo(RootMenuItem rootMenu) {
        this.rootMenuItem = rootMenu;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("statistic6Month");
    }

    @Override
    public void execute() {

    }
}
