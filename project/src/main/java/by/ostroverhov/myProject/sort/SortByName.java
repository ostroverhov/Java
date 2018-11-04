package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.RootMenuItem;

import java.util.*;

public class SortByName {
    List<Drug> ourDrugs;
    private RootMenuItem rootMenuItem;

    public SortByName(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        Collections.sort(ourDrugs, new CompByName());
        for (Object i:ourDrugs) {
            System.out.println(i);
        }
    }

    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("sortByName");
    }

}
