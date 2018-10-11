package by.ostroverhov.myProject.drugs;

import java.util.List;
import java.util.Scanner;

public class OutputDrug {
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public OutputDrug(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() {
        for (Drug i : ourDrugs) {
            System.out.println(i);
        }
    }
}
