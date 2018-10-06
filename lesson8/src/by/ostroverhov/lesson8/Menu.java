package by.ostroverhov.lesson8;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);

    private String text = SCANNER.next();
    private HashMap<Object, String> menu = new HashMap<>();
    
    public void menu() {
        menu.put(new SplitTextInList(text).splitTextInList(), "разбить текст на слова");
        menu.put(new SplitTextInTreeSet(text).splitTextInTreeSet(), "разбить без повторов");
        menu.put(new CountWords(text).countWords(), "посчитать количество");

        for (HashMap.Entry entry : menu.entrySet()) {
            System.out.println(entry.getValue() + "  " +  entry.getKey());

        }
    }
}
