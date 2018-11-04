package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.drugs.InputDrug;

import java.util.List;
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
    public void execute(List<Drug> ourDrug) {
        new InputDrug(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);

    }
}
