package by.ostroverhov.lesson5.ATM;

public class PriorATM extends ATM implements Income, Outcome, Balance, VendorInfo {
    @Override
    public String display() {
        return "PriorBank";
    }
}
