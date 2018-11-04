package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class SearchByBatch {
    private static final Scanner SCANNER = new Scanner(System.in);

    List<Drug> ourDrugs;

    public SearchByBatch(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws MySearchException {
        System.out.println("Введите номер серии: ");
        String batch = SCANNER.next();
        for (Drug i : ourDrugs) {
            if (i.getBatch().equals(batch)) {
                System.out.println(i);
            } else throw new MySearchException("Такого номера нет в базе");
        }
    }
}
