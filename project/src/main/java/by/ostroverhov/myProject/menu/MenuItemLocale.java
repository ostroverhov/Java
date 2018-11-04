package by.ostroverhov.myProject.menu;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;

public interface MenuItemLocale {
    String localeMenu();
    void execute(List<Drug> ourDrug);
}
