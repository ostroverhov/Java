package by.ostroverhov.lesson9.regexp;

public class Main {
    public static void main(String[] args) {
        Compression compression = new Compression();
        String compressed = compression.forward("hellowoooorld");
        System.out.println(compressed);
        String text = compression.back(compressed);
        System.out.println(text);
    }
}
