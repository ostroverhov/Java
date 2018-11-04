package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.MySearchException;
import by.ostroverhov.myProject.search.SearchByBatch;
import by.ostroverhov.myProject.search.SearchByName;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenySearchByName implements MenuItemLocale {
    private static final Logger LOGGER = Logger.getLogger(SearchByBatch.class.getName());

    private RootMenuItem rootMenuItem;

    public MenySearchByName(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("searchName");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        try {
            new SearchByName(ourDrug).execute();
            new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
        } catch (MySearchException e) {
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }
    }
}
