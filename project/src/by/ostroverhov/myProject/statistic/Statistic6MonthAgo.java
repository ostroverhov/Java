package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.MenuItem;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Statistic6MonthAgo implements MenuItem {
    List<Drug> ourDrugs;

    public Statistic6MonthAgo(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
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
