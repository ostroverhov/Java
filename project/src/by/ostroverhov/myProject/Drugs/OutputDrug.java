package by.ostroverhov.myProject.drugs;

import by.ostroverhov.myProject.menu.MenuItem;

import java.util.List;
import java.util.Scanner;

public class OutputDrug implements MenuItem {
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public OutputDrug(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
    public void execute() {
        for (Drug i : ourDrugs) {
            System.out.println(i);
        }
    }
}
