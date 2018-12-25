package by.ostroverhov.lesson19.domain;

public class Plumber {
    private String name;
    private int rank;
    private boolean fresh;

    public static class Builder {
        private Plumber plumber = new Plumber();

        public Builder name(String name) {
            plumber.name = name;
            return this;
        }

        public Builder rank(String rank) {
            plumber.rank = Integer.valueOf(rank);
            return this;
        }

        public Builder fresh(String fresh) {
            plumber.fresh = Boolean.valueOf(fresh);
            return this;
        }

        public Plumber build() {
            return plumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plumber{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rank=").append(rank);
        sb.append(", fresh=").append(fresh);
        sb.append('}');
        return sb.toString();
    }
}