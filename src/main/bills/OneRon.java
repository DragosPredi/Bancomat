package main.bills;

public class OneRon extends Bill {
    public OneRon() {
        valueOfBill = 1;
    }

    @Override
    public String toString() {
        return "OneRon{" +
                "value=" + valueOfBill +
                '}';
    }
}
