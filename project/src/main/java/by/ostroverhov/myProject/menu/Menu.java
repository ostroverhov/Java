package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;

public class Menu {
    private MenuItemLocale root = new LocaleChoiceMenuItem();

    public void start(List<Drug> ourDrug) {
        root.execute(ourDrug);
    }
}
