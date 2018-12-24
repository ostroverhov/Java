package by.ostroverhov.lesson13.sax;

import java.time.LocalDate;

public enum Field {
    SERVICESTATION(void.class),
    CUSTOMERS(void.class),
    CUSTOMER(void.class),
    ID(Integer.class),
    NAME(String.class),
    LASTORDER(LocalDate.class),
    DATEOFBIRTH(LocalDate.class),
    CARS(void.class),
    CAR(String.class),
    DISCOUNT(Boolean.class);

    private Class<?> type;

    Field(Class<?> type) {
        this.type = type;
    }

    public Class<?> getType() {
        return type;
    }
}