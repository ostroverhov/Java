package by.ostroverhov.myProject.drugs;

import by.ostroverhov.myProject.menu.LocaleChoiceMenuItem;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class OutputDrug {
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;
    private LocaleChoiceMenuItem rootMenuItem;

    public OutputDrug(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        for (Drug i : ourDrugs) {
            System.out.println(i);
        }
    }

    public String localeMenu() {
        Locale locale = rootMenuItem.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("resource", locale);
        return bundle.getString("outputDrug");
    }
}
