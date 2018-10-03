package by.ostroverhov.lesson8;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class InputText {
    private static final Scanner SCANNER = new Scanner(System.in);

    private String text;

    public InputText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}
