package by.ostroverhov.lesson4.array;

import java.util.Scanner;

public class ReadableArray {
    private static final Scanner SCANNER = new Scanner(System.in);

    public int[] array;
    public int size;

    public ReadableArray(int size) {
        array = new int[size];
        this.size = size;
    }

    public int[] array() {
        return array;
    }

    public void input() {
        System.out.println("Введите элементы массива в количестве: " + size);
        for (int i = 0; i < size; i++) {
            array[i] = SCANNER.nextInt();
        }
    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            output.append(array[i]).append(" | ");
        }
        output.append(array[size - 1]);
        return output.toString();
    }
}
