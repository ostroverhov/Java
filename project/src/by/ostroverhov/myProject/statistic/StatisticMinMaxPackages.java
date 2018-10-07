package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;

import java.util.List;

public class StatisticMinMaxPackages {
    List<Drug> ourDrugs;

    public StatisticMinMaxPackages(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void statisticMinMaxPackages() {
        Drug minDrugAmountPackages = ourDrugs.get(0);
        Drug maxDrugAmountPackages = ourDrugs.get(0);

        for (Drug i : ourDrugs) {
            if (i.getAmountPackages() < minDrugAmountPackages.getAmountPackages()) {
                minDrugAmountPackages = i;
            }
            if (i.getAmountPackages() > maxDrugAmountPackages.getAmountPackages()) {
                maxDrugAmountPackages = i;
            }
        }
        System.out.println("серия с минимальным количеством упаковок:\n " + minDrugAmountPackages);
        System.out.println("серия с максимальным количеством упаковок:\n " + maxDrugAmountPackages);
    }
}
