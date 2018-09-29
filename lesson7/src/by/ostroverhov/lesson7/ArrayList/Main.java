package by.ostroverhov.lesson7.ArrayList;

import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.remove(2));
        System.out.println(list);

        System.out.println(list.size());

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
