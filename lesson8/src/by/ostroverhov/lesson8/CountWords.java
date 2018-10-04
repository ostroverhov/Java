package by.ostroverhov.lesson8;

import java.util.HashMap;

public class CountWords {
    private String text;

    public CountWords(String text) {
        this.text = text;
    }

    HashMap<Object, Integer> countWordsHashMap = new HashMap<>();

    public HashMap<Object, Integer> countWords() {
        for (Object entry: new SplitTextInTreeSet(text).splitTextInTreeSet()) {
            for (Object element:new SplitTextInList(text).splitTextInList()) {
                if (entry.equals(element)) {
                    countWordsHashMap.putIfAbsent(entry, 0);
                    countWordsHashMap.put(entry, countWordsHashMap.get(entry)+1);
                }
            }

        }
        return countWordsHashMap;
    }

    public HashMap<Object, Integer> getCountWordsHashMap() {
        return countWordsHashMap;
    }

    public void name(){
        System.out.println("посчитать количество повторов каждого слова");
    }

}
