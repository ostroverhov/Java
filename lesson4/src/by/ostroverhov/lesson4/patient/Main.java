package by.ostroverhov.lesson4.patient;

public class Main {
    public static void main(String[] args) {
        PatiantList ourPatiants = new PatiantList(2);
        ourPatiants.input();
        ourPatiants.output();

        ourPatiants.search("q");
        ourPatiants.search(4);
    }
}
