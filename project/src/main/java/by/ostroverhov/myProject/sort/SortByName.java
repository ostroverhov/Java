package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.RootMenuItem;

import java.util.*;

public class SortByName {
    private List<Drug> ourDrugs;

    public SortByName(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        Collections.sort(ourDrugs, new CompByName());
        for (Object i:ourDrugs) {
            System.out.println(i);
        }
    }
}
