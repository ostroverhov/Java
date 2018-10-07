package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.Comparator;
import java.util.Date;

public class SortByDate implements Comparator<Drug> {
    @Override
    public int compare(Drug o1, Drug o2) {
        Date date1 = o1.getProductionDate();
        Date date2 = o2.getProductionDate();

        if (date1.compareTo(date2)>0)
            return 1;
        else if (date1.compareTo(date2)<0)
            return -1;
        else
            return 0;
    }
}
