package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.MenuItem;

import java.util.List;

public class ProportionOfDrugForm implements MenuItem {
    List<Drug> ourDrugs;

    public ProportionOfDrugForm(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
    public void execute() {
        int amountDrugForm = ourDrugs.size();
        int amountLiophilizate = 0;
        int amountTablet = 0;
        int amountConcentrate = 0;

        for (Drug i : ourDrugs) {
            if (i.getDrugform().equals("liophilizate"))
                amountLiophilizate++;
            if (i.getDrugform().equals("tablet"))
                amountTablet++;
            if (i.getDrugform().equals("concentrate"))
                amountConcentrate++;
        }

        System.out.println("Соотношение лекформ лиофилизат/таблетка/концентрат: "
                + (double) amountLiophilizate / amountDrugForm * 100 + "% / "
                + (double) amountTablet / amountDrugForm * 100 + "% / "
                + (double) amountConcentrate / amountDrugForm * 100 + "%");
    }

}
