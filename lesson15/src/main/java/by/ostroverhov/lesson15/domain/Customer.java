package by.ostroverhov.lesson15.domain;

import by.ostroverhov.lesson15.domain.goods.Good;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Good> goods = new ArrayList<>();
    private double cash;
    private String name;

    public Customer(double cash, String name) {
        this.cash = cash;
        this.name = name;
    }

    public Customer add(Good good) {
        goods.add(good);
        return this;
    }

    public double cash() {
        return cash;
    }

    public String name() {
        return name;
    }

    public List<Good> goods() {
        return goods;
    }

    public boolean buy(double cost) {
        double cash = this.cash - cost;
        if (cash >= 0) this.cash = cash;
        return cash >= 0;
    }
}
