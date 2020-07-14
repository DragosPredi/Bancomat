package main.bills;

public class OneHundredRon extends Bill {
    public OneHundredRon() {
        valueOfBill = 100;
    }

    @Override
    public String toString() {
        return "OneHundredRon{" +
                "value=" + valueOfBill +
                '}';
    }
}
