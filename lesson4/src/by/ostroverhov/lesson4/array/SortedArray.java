package by.ostroverhov.lesson4.array;

public class SortedArray {
    private ReadableArray arr;

    public SortedArray(ReadableArray arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 0; i < arr.array().length; i++) {
            int min = arr.array()[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.array().length; j++) {
                if (arr.array()[j] > min) {
                    min = arr.array()[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = arr.array()[i];
                arr.array()[i] = arr.array()[minIndex];
                arr.array()[minIndex] = tmp;
            }
        }
    }
}
