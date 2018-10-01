package by.ostroverhov.myProject;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.drugs.DrugList;
import by.ostroverhov.myProject.drugs.MySearchException;
import by.ostroverhov.myProject.drugs.SortByName;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DrugList drugList = new DrugList();
        drugList.initialData();
        drugList.output();

        System.out.println("------------------");
        try {
            drugList.searchByName("carboplatin");
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }
        try {
            drugList.searchByBatch("010218");
        }catch (MySearchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------");
        drugList.statisticMinMaxPackages();
        System.out.println("------------------");
        drugList.statistic6MonthsAgo();
        System.out.println("------------------");
        drugList.proportionOfDrugForm();
        System.out.println("------------------");
        Collections.sort(new ArrayList<Drug>() , new SortByName());

        for (Drug i:drugList) {
            System.out.println(i);
        }


    }
}
