package by.ostroverhov.myProject;

import by.ostroverhov.myProject.drugs.*;
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
            new SearchByName(drugList.getOurDrugs()).searchByName("decitabin");
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }
        try {
            new SearchByBatch(drugList.getOurDrugs()).searchByBatch("082118");
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------");
        new StatisticMinMaxPackages(drugList.getOurDrugs()).statisticMinMaxPackages();
        System.out.println("------------------");
        new Statistic6MonthAgo(drugList.getOurDrugs()).statistic6MonthsAgo();
        System.out.println("------------------");
        new ProportionOfDrugForm(drugList.getOurDrugs()).proportionOfDrugForm();

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
    }
}
