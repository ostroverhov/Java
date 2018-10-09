package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;
import java.util.Scanner;

public class SearchByBatch {
    Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public SearchByBatch(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws MySearchException {
        System.out.println("Введите номер серии: ");
        String batch = scanner.next();
        for (Drug i : ourDrugs) {
            if (i.getBatch().equals(batch)) {
                System.out.println(i);
            } else throw new MySearchException("данной серии препарата нет в базе");
        }
    }

    public String name() {
        return "Поиск по серии";
    }
}
