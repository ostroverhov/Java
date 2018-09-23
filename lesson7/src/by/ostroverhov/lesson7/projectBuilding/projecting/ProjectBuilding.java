package by.ostroverhov.lesson7.projectBuilding.projecting;

import by.ostroverhov.lesson7.projectBuilding.furniture.*;

public class ProjectBuilding {
    public void projectBuilding() {
        Building building = new Building("Здание 1");
        building.roomList.add(0,new Room("Комната 1", 100, 3));
        building.roomList.add(1,new Room("Комната 2", 50, 10));

        building.roomList.get(0).lampList.add(0, new Lamp(150));
        building.roomList.get(0).lampList.add(1, new Lamp(250));
        building.roomList.get(0).tableList.add(0, new Table("письменный стол", 5));
        building.roomList.get(0).chairList.add(0, new Chair("мягкое кресло", 10));
        try {
            System.out.println(building.roomList.get(0).lightningRoom());
        }catch (IlluminanceLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(building.roomList.get(0).freeArea());
        }catch (SpaceLimitException e) {
            System.out.println(e.getMessage());
        }

        building.roomList.get(1).lampList.add(0, new Lamp(50));
        building.roomList.get(1).lampList.add(1, new Lamp(50));
        building.roomList.get(1).tableList.add(0, new Table("письменный стол", 3));
        building.roomList.get(1).chairList.add(0, new Chair("мягкое кресло", 5));

        try {
            System.out.println(building.roomList.get(1).lightningRoom());
        }catch (IlluminanceLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(building.roomList.get(1).freeArea());
        }catch (SpaceLimitException e) {
            System.out.println(e.getMessage());
        }



    }
}
