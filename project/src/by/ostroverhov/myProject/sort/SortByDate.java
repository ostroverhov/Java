package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.Collections;
import java.util.List;

public class SortByDate {
    List<Drug> ourDrugs;

    public SortByDate(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        Collections.sort(ourDrugs, new CompByDate());
        for (Object i:ourDrugs) {
            System.out.println(i);
        }
    }

}
