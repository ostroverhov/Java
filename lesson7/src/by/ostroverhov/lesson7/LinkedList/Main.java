package by.ostroverhov.lesson7.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(123);
        list.add(232);
        list.add(2352);
        list.add(235452);

        System.out.println(list.get(3));

        System.out.println(list.remove(1));

        System.out.println(list.size());

        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
