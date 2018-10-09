package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.MySearchException;

import java.util.List;
import java.util.Scanner;

public class SearchByName  {
    Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public SearchByName(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws MySearchException {
        System.out.println("Введите название: ");
        String name = scanner.next();
        for (Drug i : ourDrugs) {
            if (i.getName().equals(name)) {
                System.out.println(i);
            } else throw new MySearchException("данного названия препарата нет в базе");
        }
    }

    public String name() {
        return "Поиск по названию";
    }
}
