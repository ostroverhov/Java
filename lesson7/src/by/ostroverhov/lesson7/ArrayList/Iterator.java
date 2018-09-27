package by.ostroverhov.lesson7.ArrayList;

import java.util.Objects;
import java.util.function.Consumer;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
