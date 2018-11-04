package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuExit implements MenuItemLocale{
    private RootMenuItem rootMenuItem;

    public MenuExit(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("exit");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        System.exit(0);
    }
}
