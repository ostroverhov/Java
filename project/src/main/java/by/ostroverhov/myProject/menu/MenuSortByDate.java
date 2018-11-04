package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.sort.SortByDate;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuSortByDate implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuSortByDate(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("sortByDate");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new SortByDate(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
    }
}
