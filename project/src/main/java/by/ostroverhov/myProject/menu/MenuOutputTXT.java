package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.output.OutputTXT;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class MenuOutputTXT implements MenuItemLocale {
    private static final Logger LOGGER = Logger.getLogger(OutputTXT.class.getName());
    private RootMenuItem rootMenuItem;

    public MenuOutputTXT(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("outputTXT");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        try {
            new OutputTXT(ourDrug).execute();
        } catch (Exception e) {
            LOGGER.log(Level.ALL, e.getMessage(), e);
        } finally {
            new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
        }
    }
}
