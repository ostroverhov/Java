package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.RootMenuItem;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class SortByDate {
    List<Drug> ourDrugs;
    private RootMenuItem rootMenuItem;


    public SortByDate(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        Collections.sort(ourDrugs, new CompByDate());
        for (Object i:ourDrugs) {
            System.out.println(i);
        }
    }

    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("sortByDate");
    }
}
