package by.ostroverhov.lesson8;

import by.ostroverhov.lesson8.CountWords;
import by.ostroverhov.lesson8.InputText;
import by.ostroverhov.lesson8.SplitTextInList;
import by.ostroverhov.lesson8.SplitTextInTreeSet;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);
        InputText inputText = new InputText("разделяем текст на слова на слова");
        System.out.println(new SplitTextInList(inputText.getText()).splitTextInList());
        System.out.println(new SplitTextInTreeSet(inputText.getText()).splitTextInTreeSet());

        new CountWords(inputText.getText()).countWords();
        for (Map.Entry<Object, Integer> entry:new CountWords(inputText.getText()).countWords().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("--------------");
        System.out.println("Ведите слово:");
        String word = Scaner.next();
        new Search(inputText.getText()).searchWord(word);

        new Menu().menu();
    }
}
