package by.ostroverhov.myProject.sort;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.Comparator;

public class SortByName implements Comparator<Drug> {

    @Override
    public int compare(Drug o1, Drug o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        return name1.compareTo(name2);
    }

    public void name() {
        System.out.println("Сортировка по названию");
    }
}
