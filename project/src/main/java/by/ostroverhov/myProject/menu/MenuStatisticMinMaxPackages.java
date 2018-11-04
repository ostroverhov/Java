package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.statistic.StatisticMinMaxPackages;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuStatisticMinMaxPackages implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuStatisticMinMaxPackages(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("statisticMinMax");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new StatisticMinMaxPackages(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
    }
}
