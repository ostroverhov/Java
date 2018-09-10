public class ReplacementSymbols {
    public static void main(String[] args) {
        String start = "?стр##ока #содержит?";
        String new_string = start.replace("?", " HELLO ").replace("#", "");
        System.out.println(new_string);
    }
}
