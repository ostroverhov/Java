package by.ostroverhov.lesson5.student;

public class TimePeriod {
    private int years;
    private int month;
    private int days;
    private int hours;
    private int minutes;

    public TimePeriod(int years, int month, int days, int hours, int minutes) {
        this.years = years;
        this.month = month;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "TimePeriod{" +
                "years=" + years +
                ", month=" + month +
                ", days=" + days +
                ", hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
