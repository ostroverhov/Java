package by.ostroverhov.myProject.drugs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DrugList implements InputDrug, OutputDrug {
    private static final Scanner SCANNER = new Scanner(System.in);

    ArrayList<Drug> ourDrugs = new ArrayList<Drug>();

    public void initialData() {
        ourDrugs.add(0, new Drug(0, "bortezomib", "liophilizate", "010218", parse("2018-04-05"), false, 550));
        ourDrugs.add(1, new Drug(1, "fludarabin", "tablet", "011218", parse("2018-06-08"), true, 1350));
        ourDrugs.add(2, new Drug(2, "decitabin", "liophilizate", "010516", parse("2016-03-15"), false, 580));
        ourDrugs.add(3, new Drug(3, "carboplatin", "concentrate", "082118", parse("2018-01-14"), true, 4300));
        ourDrugs.add(4, new Drug(4, "clofarabin", "liophilizate", "051717", parse("2017-08-21"), true, 1500));
    }

    @Override
    public void input() {
        System.out.println("Введите номер: ");
        int id = SCANNER.nextInt();
        System.out.println("Введите название: ");
        String name = SCANNER.next();
        System.out.println("Введите лекформу: ");
        String drugform = SCANNER.next();
        System.out.println("Введите номер серии: ");
        String batch = SCANNER.next();
        System.out.println("Введите дату производства: ");
        Date productionDate = parse(SCANNER.next());
        System.out.println("Контроль качества true/false: ");
        Boolean qualityControl = SCANNER.nextBoolean();
        System.out.println("Введите количество упаковок: ");
        int amountPackages = SCANNER.nextInt();
        ourDrugs.add(new Drug(id, name, drugform, batch, productionDate, qualityControl, amountPackages));
    }

    @Override
    public void output() {
        for (Drug i : ourDrugs) {
            System.out.println(i);
        }
    }

    public void searchByName(String name) throws MySearchException {
        for (Drug i : ourDrugs) {
            if (i.getName().equals(name)) {
                System.out.println(i);
            } else throw new MySearchException("данного названия препарата нет в базе");
        }
    }

    public void searchByBatch(String batch) throws MySearchException {
        for (Drug i : ourDrugs) {
            if (i.getBatch().equals(batch)) {
                System.out.println(i);
            } else throw new MySearchException("данной серии препарата нет в базе");
        }
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

    public void statistic6MonthsAgo() {
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.MONTH, -6);
        Date date6MonthsAgo = c.getTime();
        System.out.println(date6MonthsAgo);

        for (Drug i : ourDrugs) {
            if (i.getProductionDate().compareTo(date6MonthsAgo) < 0)
                System.out.println(i);
        }
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
        System.out.println("Соотношение лекформ лиофилизат/таблетка/концентрат: "
                + amountLiophilizate + "/" + amountTablet + "/" + amountConcentrate);
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
