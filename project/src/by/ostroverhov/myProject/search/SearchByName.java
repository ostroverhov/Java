package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.MySearchException;

import java.util.List;

public class SearchByName {

    List<Drug> ourDrugs;

    public SearchByName(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void searchByName(String name) throws MySearchException {
        for (Drug i : ourDrugs) {
            if (i.getName().equals(name)) {
                System.out.println(i);
            } else throw new MySearchException("данного названия препарата нет в базе");
        }
    }
}
