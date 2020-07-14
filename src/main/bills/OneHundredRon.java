package main.bills;

public class OneHundredRon extends BankNote {
    public OneHundredRon() {
        value = 100;
    }

    @Override
    public String toString() {
        return "OneHundredRon{" +
                "value=" + value +
                '}';
    }
}
