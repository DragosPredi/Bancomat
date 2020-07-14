package main.bills;

public class TenRon extends Bill {
    public TenRon() {
        valueOfBill = 10;
    }

    @Override
    public String toString() {
        return "TenRon{" +
                "value=" + valueOfBill +
                '}';
    }
}
