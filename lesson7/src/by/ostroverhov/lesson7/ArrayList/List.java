package by.ostroverhov.lesson7.ArrayList;

public interface List<T> extends Iterable<T>{
    void add(T element);
    T get(int index) throws IndexOutOfBoundsException;
    T remove(int index);
    int size();
}
