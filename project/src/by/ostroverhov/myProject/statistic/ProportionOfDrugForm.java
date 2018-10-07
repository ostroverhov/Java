package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;

public class ProportionOfDrugForm {
    List<Drug> ourDrugs;

    public ProportionOfDrugForm(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void proportionOfDrugForm() {
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
        double liophilizate = (double) amountLiophilizate / amountDrugForm * 100;
        double tablet = (double) amountTablet / amountDrugForm * 100;
        double concentrate = (double) amountConcentrate / amountDrugForm * 100;
        System.out.println("Соотношение лекформ лиофилизат/таблетка/концентрат: "
                + liophilizate + "% / "
                + tablet + "% / "
                + concentrate + "%");
    }
}
