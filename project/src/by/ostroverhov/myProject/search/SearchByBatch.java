package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;

public class SearchByBatch {
    List<Drug> ourDrugs;

    public SearchByBatch(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void searchByBatch(String batch) throws MySearchException {
        for (Drug i : ourDrugs) {
            if (i.getBatch().equals(batch)) {
                System.out.println(i);
            } else throw new MySearchException("данной серии препарата нет в базе");
        }
    }
}
