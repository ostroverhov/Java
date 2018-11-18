package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.RootMenuItem;

import java.util.*;

public class Statistic6MonthAgo {
    private List<Drug> ourDrugs;

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
}
