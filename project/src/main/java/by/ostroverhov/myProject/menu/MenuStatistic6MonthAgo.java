package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.statistic.Statistic6MonthAgo;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuStatistic6MonthAgo implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuStatistic6MonthAgo(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("statistic6Month");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new Statistic6MonthAgo(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
    }
}
