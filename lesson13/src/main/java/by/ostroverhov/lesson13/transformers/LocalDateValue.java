package by.ostroverhov.lesson13.transformers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateValue implements Value<LocalDate> {

    @Override
    public LocalDate transform(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
