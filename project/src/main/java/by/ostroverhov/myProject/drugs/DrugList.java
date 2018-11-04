package by.ostroverhov.myProject.drugs;

import by.ostroverhov.myProject.search.MySearchException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DrugList<T> implements Iterator<Drug> {
    private static final Scanner SCANNER = new Scanner(System.in);

    List<Drug> ourDrugs = new ArrayList<Drug>();

    {
        ourDrugs.add(0, new Drug(0, "bortezomib", "liophilizate", "010218", parse("2018-04-05"), false, 550));
        ourDrugs.add(1, new Drug(1, "fludarabin", "tablet", "011218", parse("2018-06-08"), true, 1350));
        ourDrugs.add(2, new Drug(2, "decitabin", "liophilizate", "010516", parse("2016-03-15"), false, 580));
        ourDrugs.add(3, new Drug(3, "carboplatin", "concentrate", "082118", parse("2018-01-14"), true, 4300));
        ourDrugs.add(4, new Drug(4, "clofarabin", "liophilizate", "051717", parse("2017-08-21"), true, 1500));
    }

    public List<Drug> getOurDrugs() {
        return ourDrugs;
    }

    public void output() {
        for (Drug i : ourDrugs) {
            System.out.println(i);
        }
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

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Drug next() {
        return null;
    }
}
