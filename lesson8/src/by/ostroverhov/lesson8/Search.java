package by.ostroverhov.lesson8;

import java.util.Map;

public class Search {

    String text;

    public Search(String text) {
        this.text = text;
    }

    public void searchWord(String ourWord) {
        for (Map.Entry<Object, Integer> entry: new CountWords(text).countWords().entrySet())
            if (entry.getKey().equals(ourWord))
                System.out.println(entry.getKey() + " = " + entry.getValue());

    }
}
