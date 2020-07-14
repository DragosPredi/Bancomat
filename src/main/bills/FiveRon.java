package main.bills;

public class FiveRon extends Bill {
    public FiveRon() {
        valueOfBill = 5;
    }

    @Override
    public String toString() {
        return "FiveRon{" +
                "value=" + valueOfBill +
                '}';
    }
}
