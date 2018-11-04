package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.statistic.ProportionOfDrugForm;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuProportionOfDrugForm implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuProportionOfDrugForm(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("proportion");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        new ProportionOfDrugForm(ourDrug).execute();
    }
}
