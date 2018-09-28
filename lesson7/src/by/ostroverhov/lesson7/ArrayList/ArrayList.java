package by.ostroverhov.lesson7.ArrayList;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T>, Iterable {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int index = 0;

    public ArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (index >= array.length) {
            T[] newArray = (T[]) new Object[array.length + DEFAULT_CAPACITY];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[index] = element;
        index++;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= array.length)
            throw new IndexOutOfBoundsException();
        else return array[index];
    }

    @Override
    public T remove(int index) {
        if (index >= array.length)
            throw new IndexOutOfBoundsException();
        else {
            T removeValue = array[index];

            int numMoved = array.length - index - 1;
            if (numMoved > 0) {
                System.arraycopy(array, index + 1, array, index, numMoved);
            }
            array[array.length - 1] = null;
            return removeValue;
        }
    }

    public int size() {
        return array.length;
    }


    public Iterator<T> iterator()  {
        return new Itr();
    }

    private class Itr implements Iterator<T>{
        int lastRet = -1;

        public Itr()  {
        }

        @Override
        public boolean hasNext() {
            return index != array.length - 1;
        }

        @Override
        public T next() {
            int i = index;
            if (i >= array.length)
                throw new NoSuchElementException();
            index = i + 1;
            return array[lastRet = index];
        }

        @Override
        public void remove() {
            try {
                ArrayList.this.remove(lastRet);
                index = lastRet;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }



    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                '}';
    }
}