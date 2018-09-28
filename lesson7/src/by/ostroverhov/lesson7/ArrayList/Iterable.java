package by.ostroverhov.lesson7.ArrayList;

import java.util.Objects;
import java.util.function.Consumer;

public interface Iterable {
    Iterator<T> iterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
}
