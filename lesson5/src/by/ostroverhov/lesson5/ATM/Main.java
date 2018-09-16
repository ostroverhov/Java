package by.ostroverhov.lesson5.ATM;

public class Main {
    public static void main(String[] args) {
        ATM prior = new PriorATM();
        prior.add(170);
        prior.add(170);
        prior.cashOut(120);
        System.out.println(prior.display());
        System.out.println(prior.total());

        ATM belarus = new BelarusATM();
        belarus.add(170);
        belarus.add(170);
        belarus.cashOut(120);
        belarus.display();
        System.out.println(belarus.display());
        System.out.println(belarus.total());


    }
}
