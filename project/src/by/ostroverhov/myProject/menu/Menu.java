package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.SearchByBatch;
import by.ostroverhov.myProject.search.SearchByName;
import by.ostroverhov.myProject.statistic.ProportionOfDrugForm;
import by.ostroverhov.myProject.statistic.Statistic6MonthAgo;
import by.ostroverhov.myProject.statistic.StatisticMinMaxPackages;

import java.util.*;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);

    List<Drug> ourDrugs;
    private List menu = new LinkedList();

    {

        menu.add(new ProportionOfDrugForm(ourDrugs));
        menu.add(new Statistic6MonthAgo(ourDrugs));
        menu.add(new StatisticMinMaxPackages(ourDrugs));
    }

    public void execute() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i+1 + " " + menu.get(i).menu());
        }
        menu[SCANNER.nextInt()].execute();
    }
}
