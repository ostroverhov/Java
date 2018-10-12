package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.MenuItem;

import java.util.Collections;
import java.util.List;

public class SortByDate implements MenuItem {
    List<Drug> ourDrugs;

    public SortByDate(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
    public void execute() {
        Collections.sort(ourDrugs, new CompByDate());
        for (Object i:ourDrugs) {
            System.out.println(i);
        }
    }

}
