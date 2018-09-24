package by.ostroverhov.lesson7.projectBuilding.projecting;

import by.ostroverhov.lesson7.projectBuilding.furniture.*;

import java.util.LinkedList;
import java.util.List;

public class Room {
    private String name;
    private int area;
    private int windowsNumber;

    public Room(String name, int area, int windowsNumber) {
        this.name = name;
        this.area = area;
        this.windowsNumber = windowsNumber;
    }

    public List<Lamp> lampList = new LinkedList<Lamp>();
    public List<Table> tableList = new LinkedList<Table>();
    public List<Chair> chairList = new LinkedList<Chair>();

    public int lightningRoom() throws IlluminanceLimitException {
        int lightning = windowsNumber * 700;
        for (Lamp i : lampList) {
            lightning += i.getLightning();
        }
        if (lightning < 4000 && lightning > 300)
            return lightning;
        else
            throw new IlluminanceLimitException("освещеность выходит за допустимые пределы");
    }

    public int freeArea() throws SpaceLimitException {
        int areaTable = 0;
        int areaChair = 0;
        for (Table table : tableList) {
            areaTable += table.getArea();
        }
        for (Chair chair : chairList) {
            areaChair += chair.getArea();
        }
        if (areaChair + areaTable <= 0.7 * area)
            return area = area - areaTable - areaChair;
        else
            throw new SpaceLimitException("количество добавленной мебели превышает пределы");
    }

    @Override
    public String toString() {
        return name +
                ", площадь " + area + " м^2" +
                ", количество окон " + windowsNumber;
    }
}
