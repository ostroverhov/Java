package by.ostroverhov.myProject;

import by.ostroverhov.myProject.drugs.*;
import by.ostroverhov.myProject.menu.Menu;
import by.ostroverhov.myProject.search.MySearchException;
import by.ostroverhov.myProject.search.SearchByBatch;
import by.ostroverhov.myProject.search.SearchByName;
import by.ostroverhov.myProject.sort.SortByDate;
import by.ostroverhov.myProject.sort.SortByName;
import by.ostroverhov.myProject.statistic.ProportionOfDrugForm;
import by.ostroverhov.myProject.statistic.Statistic6MonthAgo;
import by.ostroverhov.myProject.statistic.StatisticMinMaxPackages;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DrugList drugList = new DrugList();

        System.out.println("------------------");
        try {
            new SearchByName(drugList.getOurDrugs()).execute();
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }
        try {
            new SearchByBatch(drugList.getOurDrugs()).execute();
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------");
        new StatisticMinMaxPackages(drugList.getOurDrugs()).execute();
        System.out.println("------------------");
        new Statistic6MonthAgo(drugList.getOurDrugs()).execute();
        System.out.println("------------------");
        new ProportionOfDrugForm(drugList.getOurDrugs()).execute();

        System.out.println("------------------");
        Collections.sort( drugList.getOurDrugs(), new SortByName());
        for (Object i:drugList.getOurDrugs()) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        Collections.sort( drugList.getOurDrugs(), new SortByDate());
        for (Object i:drugList.getOurDrugs()) {
            System.out.println(i);
        }

        new Menu().execute();
    }
}
