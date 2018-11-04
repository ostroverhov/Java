package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.SearchByBatch;


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationChoiceMenuItem implements MenuItemLocale, RootMenuItem {
    private static final Logger LOGGER = Logger.getLogger(OperationChoiceMenuItem.class.getName());
    private static final Scanner SCANNER = new Scanner(System.in);

    private RootMenuItem rootMenuItem;
    private Map<Integer, MenuItemLocale> menu = new LinkedHashMap<>();

    {
        menu.put(1, new MenuSortByDate(this));
        menu.put(2, new MenuSortByName(this));
        menu.put(3, new MenuSearchByBatch(this));
        menu.put(4, new MenySearchByName(this));
        menu.put(5, new MenuProportionOfDrugForm(this));
        menu.put(6, new MenuStatisticMinMaxPackages(this));
        menu.put(7, new MenuStatistic6MonthAgo(this));
        menu.put(8, new MenuOutputDrug(this));
        menu.put(9, new MenuInputDrug(this));
        menu.put(10, new MenuExit(this));
    }

    public OperationChoiceMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        return null;
    }

    public void execute(List<Drug> ourDrug) {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);

        StringBuilder show = new StringBuilder(bundle.getString("select"));
        for (Map.Entry<Integer, MenuItemLocale> entry : menu.entrySet()) {
            show.append("\n").append(entry.getKey()).append(". ").append(entry.getValue().localeMenu());
        }
        System.out.println(show.toString());


        try {
            int choice = SCANNER.nextInt();
            System.out.println(menu.get(choice).localeMenu());
            menu.get(choice).execute(ourDrug);
        } catch (IndexOutOfBoundsException e) {
            LOGGER.log(Level.ALL, "Введите номер операции еще раз", e);
            this.execute(ourDrug);
        }
    }

    @Override
    public Locale getLocale() {
        return rootMenuItem.getLocale();
    }
}
