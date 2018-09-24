package by.ostroverhov.lesson7.projectBuilding;

import by.ostroverhov.lesson7.projectBuilding.furniture.*;
import by.ostroverhov.lesson7.projectBuilding.projecting.Building;
import by.ostroverhov.lesson7.projectBuilding.projecting.Room;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Здание 1");
        building.roomList.add(0, new Room("Комната 1", 100, 3));
        building.roomList.add(1, new Room("Комната 2", 50, 10));

        building.roomList.get(0).lampList.add(0, new Lamp(150));
        building.roomList.get(0).lampList.add(1, new Lamp(250));
        building.roomList.get(0).tableList.add(0, new Table("письменный стол", 5));
        building.roomList.get(0).chairList.add(0, new Chair("мягкое кресло", 10));

        building.roomList.get(1).lampList.add(0, new Lamp(50));
        building.roomList.get(1).lampList.add(1, new Lamp(50));
        building.roomList.get(1).tableList.add(0, new Table("письменный стол", 3));
        building.roomList.get(1).chairList.add(0, new Chair("мягкое кресло", 5));

        System.out.println(building.toString());
        System.out.println(building.roomList.get(0));
        try {
            System.out.println("суммарная освещенность равна " + building.roomList.get(0).lightningRoom() + " лм");
        } catch (IlluminanceLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("свободная площадь равна " + building.roomList.get(0).freeArea() + " м^2");
        } catch (SpaceLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Мебель: " + building.roomList.get(0).tableList.get(0) + building.roomList.get(0).chairList.get(0));

        System.out.println();
        System.out.println(building.roomList.get(1));
        try {
            System.out.println("суммарная освещенность равна " + building.roomList.get(1).lightningRoom() + " лм");
        } catch (IlluminanceLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("свободная площадь равна " + building.roomList.get(1).freeArea() + " м^2");
        } catch (SpaceLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Мебель: " + building.roomList.get(1).tableList.get(0) + building.roomList.get(1).chairList.get(0));
    }
}
