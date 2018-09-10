public class MoneyNamed {
    public static void main(String[] args) {
        int rubl = 0;
        int rubl1 = rubl % 100;
        if (rubl1 <= 20 && rubl1 >=10) {
            System.out.println(rubl + " рублей");
        } else {
            int rubl2 = rubl % 10;
            if (rubl2 == 0 || rubl2 == 5 || rubl2 == 6 || rubl2 == 7 || rubl2 == 8 || rubl2 == 9)
                System.out.println(rubl + " рублей");
            else if (rubl2 == 1)
                System.out.println(rubl + " рубль");
            else if (rubl2 == 2 || rubl2 == 3 || rubl2 == 4)
                System.out.println(rubl + " рубля");
        }
    }
}
