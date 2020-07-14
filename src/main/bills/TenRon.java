package main.bills;

public class TenRon extends BankNote {
    public TenRon() {
        value = 10;
    }

    @Override
    public String toString() {
        return "TenRon{" +
                "value=" + value +
                '}';
    }
}
