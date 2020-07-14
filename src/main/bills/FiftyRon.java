package main.bills;

public class FiftyRon extends BankNote {
    public FiftyRon() {
        value = 50;
    }

    @Override
    public String toString() {
        return "FiftyRon{" +
                "value=" + value +
                '}';
    }
}
