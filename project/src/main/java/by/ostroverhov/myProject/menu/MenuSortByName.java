package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.sort.SortByName;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuSortByName implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuSortByName(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("sortByName");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new SortByName(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
    }
}
