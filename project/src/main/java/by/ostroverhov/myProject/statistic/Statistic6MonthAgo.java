package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.RootMenuItem;

import java.util.*;

public class Statistic6MonthAgo {
    List<Drug> ourDrugs;
    private RootMenuItem rootMenuItem;

    public Statistic6MonthAgo(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.MONTH, -6);
        Date date6MonthsAgo = c.getTime();
        System.out.println(date6MonthsAgo);

        for (Drug i : ourDrugs) {
            if (i.getProductionDate().compareTo(date6MonthsAgo) < 0)
                System.out.println(i);
        }
    }

    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("statistic6Month");
    }
}
