package main.bills;

public class FiftyRon extends Bill {
    public FiftyRon() {
        valueOfBill = 50;
    }

    @Override
    public String toString() {
        return "FiftyRon{" +
                "value=" + valueOfBill +
                '}';
    }
}
