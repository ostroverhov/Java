package by.ostroverhov.lesson13.transformers;

public interface Value<T> {
    T transform(String s);
}