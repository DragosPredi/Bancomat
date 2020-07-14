package main.bills;

public abstract class BankNote {
    int value;

    public enum Type{
        ONE_RON,
        FIVE_RON,
        TEN_RON,
        FIFTY_RON,
        ONEHUNDRED_RON
    }

    public int getValue() {
        return value;
    }
}
