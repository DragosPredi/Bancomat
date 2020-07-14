package test;

import main.AutomaticTellerMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.bills.BankNote;
import org.junit.Test;


public class AutomaticTellerMachineTest {
    @Test
    public void initialStateChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        assertEquals(100, tester.getBankNotesQuantityByType(BankNote.Type.ONE_RON), "Initial state for 1 RON is faulty");
        assertEquals(100, tester.getBankNotesQuantityByType(BankNote.Type.FIVE_RON), "Initial state for 5 RON is faulty");
        assertEquals(100, tester.getBankNotesQuantityByType(BankNote.Type.TEN_RON), "Initial state for 10 RON is faulty");
        assertEquals(50, tester.getBankNotesQuantityByType(BankNote.Type.FIFTY_RON), "Initial state for 50 RON is faulty");
        assertEquals(50, tester.getBankNotesQuantityByType(BankNote.Type.ONEHUNDRED_RON), "Initial state for 100 RON is faulty");
    }

    @Test
    public void fillUpChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        tester.fillUp(BankNote.Type.ONE_RON, 10);
        tester.fillUp(BankNote.Type.FIVE_RON, 10);
        tester.fillUp(BankNote.Type.TEN_RON, 10);
        tester.fillUp(BankNote.Type.FIFTY_RON, 10);
        tester.fillUp(BankNote.Type.ONEHUNDRED_RON, 10);

        assertEquals(110, tester.getBankNotesQuantityByType(BankNote.Type.ONE_RON), "Fill up for 1 RON is faulty");
        assertEquals(110, tester.getBankNotesQuantityByType(BankNote.Type.FIVE_RON), "Fill up for 5 RON is faulty");
        assertEquals(110, tester.getBankNotesQuantityByType(BankNote.Type.TEN_RON), "Fill up for 10 RON is faulty");
        assertEquals(60, tester.getBankNotesQuantityByType(BankNote.Type.FIFTY_RON), "Fill up for 50 RON is faulty");
        assertEquals(60, tester.getBankNotesQuantityByType(BankNote.Type.ONEHUNDRED_RON), "Fill up for 100 RON is faulty");
    }
}
