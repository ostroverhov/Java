package by.ostroverhov.lesson8;

import java.util.LinkedList;

public class SplitTextInList {
    private String text;

    public SplitTextInList(String text) {
        this.text = text;
    }

    LinkedList words = new LinkedList();

    public LinkedList splitTextInList() {
        for (String o:text.split(" ")) {
            words.add(o);
        }
        return words;
    }

    public void name(){
        System.out.println("разбить на слова");
    }
}
