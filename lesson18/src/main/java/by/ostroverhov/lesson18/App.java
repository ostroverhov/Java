package by.ostroverhov.lesson18;

public class App {
    public static void main(String[] args) {
        Programmers programmers = new Programmers();
        try {
            System.out.println(programmers.find("java"));
        } catch (ProgrammerFindException e) {
            e.printStackTrace();
        }
    }
}