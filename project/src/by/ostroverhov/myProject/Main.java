package by.ostroverhov.myProject;

import by.ostroverhov.myProject.drugs.DrugList;
import by.ostroverhov.myProject.drugs.MySearchException;

public class Main {
    public static void main(String[] args) {
        DrugList drugList = new DrugList(5);
        drugList.input();
        drugList.output();


    }
}
