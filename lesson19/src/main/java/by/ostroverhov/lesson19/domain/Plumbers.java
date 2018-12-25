package by.ostroverhov.lesson19.domain;

import java.util.ArrayList;
import java.util.List;

public class Plumbers{
    public static final Plumbers INSTANCE = new Plumbers();
    private List<Plumber> plumbers = new ArrayList<>();

    private Plumbers() {}

    public Plumbers add(Plumber plumber) {
        plumbers.add(plumber);
        return this;
    }

    public List<Plumber> getPlumbers() {
        return plumbers;
    }

    public void setPlumbers(List<Plumber> plumbers) {
        this.plumbers = plumbers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plumbers{");
        sb.append("plumbers=").append(plumbers);
        sb.append('}');
        return sb.toString();
    }
}