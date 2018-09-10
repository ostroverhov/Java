public class DivideString {
    public static void main(String[] args) {
        String full = "hello world";
        int lenth_string = full.length();
        System.out.println("длина начальной строки равна " + lenth_string);
        int half_string = lenth_string / 2;
        System.out.println(half_string);
        String substr1 = full.substring(0, half_string);
        String substr2 = full.substring(half_string);
        System.out.println(substr1);
        System.out.println(substr2);
    }
}
