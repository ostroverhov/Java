package by.ostroverhov.myProject.statistic;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.menu.MenuItem;

import java.util.List;

public class StatisticMinMaxPackages implements MenuItem {
    List<Drug> ourDrugs;

    public StatisticMinMaxPackages(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
    public void execute() {
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
