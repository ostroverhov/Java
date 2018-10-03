package by.ostroverhov.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class CountWords {
    private String text;

    public CountWords(String text) {
        this.text = text;
    }

    HashMap<Object, Integer> countWordsHashMap = new HashMap<>();

    public void countWords() {
        for (Object entry: new SplitTextInTreeSet(text).splitTextInTreeSet()) {
            for (Object element:new SplitTextInList(text).splitTextInList()) {
                if (entry.equals(element)) {
                    countWordsHashMap.putIfAbsent(entry, 0);
                    countWordsHashMap.put(entry, countWordsHashMap.get(entry)+1);
                }
            }

        }
        for (Map.Entry<Object, Integer> entry:countWordsHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
