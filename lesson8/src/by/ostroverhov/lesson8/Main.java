package by.ostroverhov.lesson8;

import by.ostroverhov.lesson8.CountWords;
import by.ostroverhov.lesson8.InputText;
import by.ostroverhov.lesson8.SplitTextInList;
import by.ostroverhov.lesson8.SplitTextInTreeSet;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        InputText inputText = new InputText("разделяем текст на слова на слова");
        System.out.println(new SplitTextInList(inputText.getText()).splitTextInList());
        System.out.println(new SplitTextInTreeSet(inputText.getText()).splitTextInTreeSet());

        new CountWords(inputText.getText()).countWords();


    }
}
