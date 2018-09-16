package by.ostroverhov.lesson5.ATM;

public class BelarusATM extends ATM implements Income, Outcome, Balance, VendorInfo {
    @Override
    public String display() {
        return "BelarusBank";
    }
}
