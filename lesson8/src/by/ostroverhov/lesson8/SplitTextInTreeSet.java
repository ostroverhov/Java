package by.ostroverhov.lesson8;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SplitTextInTreeSet {
    private String text;

    public SplitTextInTreeSet(String text) {
        this.text = text;
    }

    TreeSet sortedWords = new TreeSet(new Comp());

    public TreeSet splitTextInTreeSet() {
        for (String o:text.split(" ")) {
            sortedWords.add(o);
        }
        return sortedWords;
    }



}
