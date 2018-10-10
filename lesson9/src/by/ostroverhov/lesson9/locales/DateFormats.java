package by.ostroverhov.lesson9.locales;

import java.util.Arrays;
import java.util.List;

public class DateFormats {
    private List<String> dateFormats = Arrays.asList("FULL", "LONG", "MEDIUM", "SHORT");

    public String get(int i) {
        return dateFormats.get(i);
    }

    public int size() {
        return dateFormats.size();
    }
}
