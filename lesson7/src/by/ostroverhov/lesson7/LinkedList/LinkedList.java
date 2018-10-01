package by.ostroverhov.lesson7.LinkedList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private static class Node<T> {

        T item;

        Node<T> next;
        Node<T> prev;
        public Node(Node<T> prev, T item, Node<T> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return String.valueOf(item);
        }

    }

    Node<T> node(int index) {
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    T unlink(Node<T> x) {
        final T element = x.item;
        final Node<T> next = x.next;
        final Node<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public void add(T element) {
        Node<T> l = last;
        Node<T> newNode = new Node<T>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            return node(index).item;

        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < size) {
            return unlink(node(index));

        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return size;
    }

//-------------------------------------------

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    public class Itr implements Iterator<T> {
        int nextIndex;
        private Node<T> lastReturned;
        private Node<T> next;

        public Itr() {
            int index = 0;
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }
    }

}