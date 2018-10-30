package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;


import java.util.*;

public class OperationChoiceMenuItem implements MenuItemLocale, RootMenuItem {
    private RootMenuItem rootMenuItem;
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;
    private Map<Integer, MenuItemLocale> menu = new LinkedHashMap<>();

    {
        //menu.put(1, new MenuSortByDate(this));
        //menu.put(2, new MenuSortByName(this));
    //    menu.put(3, new MenuSearchByBatch(rootMenuItem));
    //    menu.put(4, new MenySearchByName(rootMenuItem));
    //    menu.put(5, new MenuProportionOfDrugForm(rootMenuItem));
    //    menu.put(6, new MenuStatisticMinMaxPackages(rootMenuItem));
    //    menu.put(7, new MenuStatistic6MonthAgo(rootMenuItem));
    }

    public OperationChoiceMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        return null;
    }

    public void execute() {
        new MenuSortByDate(this).localeMenu();
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);

        StringBuilder show = new StringBuilder(bundle.getString("select"));
        for (Map.Entry<Integer, MenuItemLocale> entry : menu.entrySet()) {
            show.append("\n").append(entry.getKey()).append(". ").append(entry.getValue().localeMenu());
        }
        System.out.println(show.toString());

        int choice = scanner.nextInt();
        System.out.println(menu.get(choice).localeMenu());
        menu.get(choice).execute();
    }

    @Override
    public Locale getLocale() {
        return null;
    }
}
