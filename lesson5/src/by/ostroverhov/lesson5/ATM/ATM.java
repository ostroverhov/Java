package by.ostroverhov.lesson5.ATM;

public abstract class ATM implements Income, Outcome, Balance, VendorInfo {
    private int banknotes20;
    private int banknotes50;
    private int banknotes100;

    @Override
    public void add(int sum) {
        int banknotes100 = sum / 100;
        int banknotes50 = (sum - banknotes100 * 100) / 50;
        int banknotes20 = (sum - banknotes100 * 100 - banknotes50 * 50) / 20;
        int remain = sum - (banknotes100 * 100 + banknotes50 * 50 + banknotes20 * 20);
        if (remain == 0) {
            this.banknotes20 += banknotes20;
            this.banknotes50 += banknotes50;
            this.banknotes100 += banknotes100;
        }
    }

    @Override
    public void cashOut(int sum) {
        int banknotes100 = sum / 100;
        int banknotes50 = (sum - banknotes100 * 100) / 50;
        int banknotes20 = (sum - banknotes100 * 100 - banknotes50 * 50) / 20;
        int remain = sum - (banknotes100 * 100 + banknotes50 * 50 + banknotes20 * 20);
        if (remain == 0 && this.banknotes20 >= banknotes20 && this.banknotes50 >= banknotes50 && this.banknotes100 >= banknotes100) {
            this.banknotes20 -= banknotes20;
            this.banknotes50 -= banknotes50;
            this.banknotes100 -= banknotes100;
        }
    }

    @Override
    public int total() {
        return banknotes100 * 100 + banknotes50 * 50 + banknotes20 * 20;
    }

    @Override
    public abstract String display();
}
