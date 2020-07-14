package main.bills;

public class FiveRon extends BankNote {
    public FiveRon() {
        value = 5;
    }

    @Override
    public String toString() {
        return "FiveRon{" +
                "value=" + value +
                '}';
    }
}
