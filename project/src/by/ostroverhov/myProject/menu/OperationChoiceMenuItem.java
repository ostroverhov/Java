package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.drugs.InputDrug;
import by.ostroverhov.myProject.drugs.OutputDrug;
import by.ostroverhov.myProject.search.SearchByBatch;
import by.ostroverhov.myProject.search.SearchByName;
import by.ostroverhov.myProject.sort.SortByDate;
import by.ostroverhov.myProject.sort.SortByName;
import by.ostroverhov.myProject.statistic.ProportionOfDrugForm;
import by.ostroverhov.myProject.statistic.Statistic6MonthAgo;
import by.ostroverhov.myProject.statistic.StatisticMinMaxPackages;

import java.util.*;

public class OperationChoiceMenuItem<localeChoice> implements MenuItem {
    private RootMenuItem rootMenuItem;
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;
    private Map<Object, String> menu = new LinkedHashMap<>();

    public OperationChoiceMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    public void execute() {
        Locale locale = rootMenuItem.getLocale();           //вынести в отдельный метод?
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        menu.put(new InputDrug(ourDrugs), bundle.getString("inputDrug"));
        menu.put(new OutputDrug(ourDrugs), bundle.getString("outputDrug"));
        menu.put(new SearchByBatch(ourDrugs), bundle.getString("searchBath"));
        menu.put(new SearchByName(ourDrugs), bundle.getString("searchName"));
        menu.put(new SortByName(ourDrugs), bundle.getString("sortByName"));
        menu.put(new SortByDate(ourDrugs), bundle.getString("sortByDate"));
        menu.put(new ProportionOfDrugForm(ourDrugs), bundle.getString("proportion"));
        menu.put(new Statistic6MonthAgo((ourDrugs)), bundle.getString("statistic6Month"));
        menu.put(new StatisticMinMaxPackages((ourDrugs)), bundle.getString("statisticMinMax"));

        StringBuilder show = new StringBuilder(bundle.getString("select"));
        int count = 1;
        for (Map.Entry<Object, String> entry : menu.entrySet()) {
            show.append("\n").append(count).append(". ").append(entry.getValue());
            count++;
        }
        System.out.println(show.toString());

        int choice = scanner.nextInt();

    }

}
