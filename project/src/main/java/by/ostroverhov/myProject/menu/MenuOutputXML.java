package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.output.OutputXML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuOutputXML implements MenuItemLocale {
    private RootMenuItem rootMenuItem;

    public MenuOutputXML(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("outputXML");
    }

    @Override
    public void execute(List<Drug> ourDrug) {
        try {
            new OutputXML(ourDrug).execute();
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        } finally {
            new OperationChoiceMenuItem(rootMenuItem).execute(ourDrug);
        }
    }
}
