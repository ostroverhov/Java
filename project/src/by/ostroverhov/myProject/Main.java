package by.ostroverhov.myProject;

import by.ostroverhov.myProject.Drugs.DrugList;

public class Main {
    public static void main(String[] args) {
        DrugList drugList = new DrugList(2);
        drugList.input();
        drugList.output();
    }
}
