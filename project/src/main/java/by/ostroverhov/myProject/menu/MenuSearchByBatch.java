package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.MySearchException;
import by.ostroverhov.myProject.search.SearchByBatch;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuSearchByBatch implements MenuItemLocale {
    private static final Logger LOGGER = Logger.getLogger(SearchByBatch.class.getName());
    private RootMenuItem rootMenuItem;

    public MenuSearchByBatch(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("searchBatch");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        try {
            new SearchByBatch(ourDrug).execute();
            new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
        } catch (MySearchException e) {
            LOGGER.log(Level.ALL, e.getMessage(), e);
        }
    }
}
