package main;

import main.bills.*;

import java.util.HashMap;

public class AutomaticTellerMachine {
    private HashMap<BankNote.Type, Integer> numberOfBankNotesByType;

    public AutomaticTellerMachine() {
        numberOfBankNotesByType = new HashMap<>();
        numberOfBankNotesByType.put(BankNote.Type.ONE_RON, 100);
        numberOfBankNotesByType.put(BankNote.Type.FIVE_RON, 100);
        numberOfBankNotesByType.put(BankNote.Type.TEN_RON, 100);
        numberOfBankNotesByType.put(BankNote.Type.FIFTY_RON, 50);
        numberOfBankNotesByType.put(BankNote.Type.ONEHUNDRED_RON, 50);
    }

    public void fillUp(BankNote.Type type, int quantity) {
        int leftOverCash = numberOfBankNotesByType.get(type);
        numberOfBankNotesByType.put(type, quantity + leftOverCash);
    }

    public int getBankNotesQuantityByType(BankNote.Type type){
        return numberOfBankNotesByType.get(type);
    }
}
