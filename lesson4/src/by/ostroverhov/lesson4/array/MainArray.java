package by.ostroverhov.lesson4.array;

public class MainArray {
    public static void main(String[] args) {
        ReadableArray readable = new ReadableArray(10);
        readable.input();
        readable.output();

        SortedArray sorted = new SortedArray(readable);
        sorted.sort();
        readable.output();
    }   
}
