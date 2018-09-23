package by.ostroverhov.lesson7.projectBuilding.projecting;

import java.util.LinkedList;
import java.util.List;

public class Building {
    private String name;

    public String getName() {
        return name;
    }

    public Building(String name) {
        this.name = name;
    }

    List<Room> roomList = new LinkedList<Room>();

}
