package by.ostroverhov.lesson7.ArrayList;

import java.util.Objects;
import java.util.function.Consumer;

public interface Iterable<T> {
    boolean hasNext();
    T next();
    void remove();
    void forEach(Consumer<? super T> action);
}
