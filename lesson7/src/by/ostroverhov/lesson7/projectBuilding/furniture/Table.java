package by.ostroverhov.lesson7.projectBuilding.furniture;

public class Table {
    private String name;
    private int area;

    public Table(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name + " (площадь " + area + " м^2) ";
    }
}
