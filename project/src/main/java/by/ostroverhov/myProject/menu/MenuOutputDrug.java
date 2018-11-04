package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.drugs.OutputDrug;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuOutputDrug implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuOutputDrug(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("outputDrug");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new OutputDrug(ourDrug).execute();
        new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
    }
}
