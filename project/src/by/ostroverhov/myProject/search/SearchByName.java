package by.ostroverhov.myProject.search;

import by.ostroverhov.myProject.drugs.Drug;
import by.ostroverhov.myProject.search.MySearchException;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchByName  {
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public SearchByName(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws MySearchException {
        System.out.println("Введите название: ");
        String name = scanner.next();

        Pattern serch = Pattern.compile("");
        for (Drug i : ourDrugs) {
            Matcher matcher = serch.matcher(i.getName());
            if (matcher.matches()) {
                System.out.println(i);
            }
        }
    }
}
