package main.bills;

public class OneRon extends BankNote {
    public OneRon() {
        value = 1;
    }

    @Override
    public String toString() {
        return "OneRon{" +
                "value=" + value +
                '}';
    }
}
