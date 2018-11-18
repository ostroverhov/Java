package by.ostroverhov.myProject;

import by.ostroverhov.myProject.drugs.*;
import by.ostroverhov.myProject.menu.Menu;
import by.ostroverhov.myProject.menu.MenuSortByDate;
import by.ostroverhov.myProject.search.MySearchException;
import by.ostroverhov.myProject.search.SearchByBatch;
import by.ostroverhov.myProject.search.SearchByName;
import by.ostroverhov.myProject.sort.SortByDate;
import by.ostroverhov.myProject.sort.SortByName;
import by.ostroverhov.myProject.statistic.ProportionOfDrugForm;
import by.ostroverhov.myProject.statistic.Statistic6MonthAgo;
import by.ostroverhov.myProject.statistic.StatisticMinMaxPackages;

import java.io.IOException;
import java.util.*;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) {


        DrugList drugList = new DrugList();
        new Menu().start(drugList.getOurDrugs());
    }
}
