package by.ostroverhov.myProject.drugs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DrugList implements InputDrug, OutputDrug {

    private Drug[] ourDrugs;
    private int countDrugs;

    public DrugList(int countDrugs) {
        this.countDrugs = countDrugs;
        ourDrugs = new Drug[countDrugs];
    }

    @Override
    public void input() {
        ourDrugs[0] = new Drug(0, "bortezomib", "liophilizate", "010218", parse("2018-04-05"), false, 550);
        ourDrugs[1] = new Drug(1, "fludarabin", "tablet", "011218", parse("2018-06-08"), true, 1350);
        ourDrugs[2] = new Drug(2, "decitabin", "liophilizate", "010516", parse("2016-03-15"), false, 580);
        ourDrugs[3] = new Drug(3, "carboplatin", "concentrate", "082118", parse("2018-01-14"), true, 4300);
        ourDrugs[4] = new Drug(4, "clofarabin", "liophilizate", "051717", parse("2017-08-21"), true, 1500);
    }

    public void SortingByName(Drug[] ourDrugs) {
        String[] nameDrugs = new String[5];
        for (int i = 0; i < countDrugs; i++) {
            nameDrugs[i] = ourDrugs[i].getName();

        }

    }

    public void searchByName(String name) throws MySearchException {
        for (int i = 0; i < countDrugs; i++) {
            if (ourDrugs[i].getName().equals(name)){
                System.out.println(ourDrugs[i]);
            } else
                throw new MySearchException("данного названия препарата нет в базе");
        }
    }

    public void searchByBatch(String batch) throws MySearchException {
        for (int i = 0; i < countDrugs; i++) {
            if (ourDrugs[i].getBatch().equals(batch)){
                System.out.println(ourDrugs[i]);
            } else
                throw new MySearchException("данной серии препарата нет в базе");
        }
    }

    private Date parse (String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    @Override
    public void output() {
        for (int i = 0; i < countDrugs; i++) {
            System.out.println(ourDrugs[i]);
        }
    }
}
