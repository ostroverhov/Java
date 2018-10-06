package by.ostroverhov.lesson8;

import java.util.Comparator;

public class Comp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length())
            if (o1.compareTo(o2) == 0)
                return 0;
        if (o1.length() > o2.length())
            return 1;
        else
        return -1;
    }



}
