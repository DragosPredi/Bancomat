package test;

import main.AutomaticTellerMachine;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.bills.Bill;
import org.junit.Test;


public class AutomaticTellerMachineTest {
    public void setArray(int []arr, int one, int five, int ten, int fifty, int oneH){
        arr[0] = one;
        arr[1] = five;
        arr[2] = ten;
        arr[3] = fifty;
        arr[4] = oneH;
    }

    @Test
    public void initialStateChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.ONE_RON), "Initial state for 1 RON is faulty");
        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.FIVE_RON), "Initial state for 5 RON is faulty");
        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.TEN_RON), "Initial state for 10 RON is faulty");
        assertEquals(50, tester.getBillsQuantityByType(Bill.Type.FIFTY_RON), "Initial state for 50 RON is faulty");
        assertEquals(50, tester.getBillsQuantityByType(Bill.Type.ONEHUNDRED_RON), "Initial state for 100 RON is faulty");
    }

    @Test
    public void fillUpChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        tester.fillUp(Bill.Type.ONE_RON, 10);
        tester.fillUp(Bill.Type.FIVE_RON, 10);
        tester.fillUp(Bill.Type.TEN_RON, 10);
        tester.fillUp(Bill.Type.FIFTY_RON, 10);
        tester.fillUp(Bill.Type.ONEHUNDRED_RON, 10);

        assertEquals(110, tester.getBillsQuantityByType(Bill.Type.ONE_RON), "Fill up for 1 RON is faulty");
        assertEquals(110, tester.getBillsQuantityByType(Bill.Type.FIVE_RON), "Fill up for 5 RON is faulty");
        assertEquals(110, tester.getBillsQuantityByType(Bill.Type.TEN_RON), "Fill up for 10 RON is faulty");
        assertEquals(60, tester.getBillsQuantityByType(Bill.Type.FIFTY_RON), "Fill up for 50 RON is faulty");
        assertEquals(60, tester.getBillsQuantityByType(Bill.Type.ONEHUNDRED_RON), "Fill up for 100 RON is faulty");
    }

    @Test
    public void modifyNrBillsChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        int []bills = {5, 1, 2, 3, 4};
        tester.modifyAllBills(bills, 1);

        assertEquals(105, tester.getBillsQuantityByType(Bill.Type.ONE_RON), "Initial state for 1 RON is faulty");
        assertEquals(101, tester.getBillsQuantityByType(Bill.Type.FIVE_RON), "Initial state for 5 RON is faulty");
        assertEquals(102, tester.getBillsQuantityByType(Bill.Type.TEN_RON), "Initial state for 10 RON is faulty");
        assertEquals(53, tester.getBillsQuantityByType(Bill.Type.FIFTY_RON), "Initial state for 50 RON is faulty");
        assertEquals(54, tester.getBillsQuantityByType(Bill.Type.ONEHUNDRED_RON), "Initial state for 100 RON is faulty");

        tester.modifyAllBills(bills, -1);

        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.ONE_RON), "Initial state for 1 RON is faulty");
        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.FIVE_RON), "Initial state for 5 RON is faulty");
        assertEquals(100, tester.getBillsQuantityByType(Bill.Type.TEN_RON), "Initial state for 10 RON is faulty");
        assertEquals(50, tester.getBillsQuantityByType(Bill.Type.FIFTY_RON), "Initial state for 50 RON is faulty");
        assertEquals(50, tester.getBillsQuantityByType(Bill.Type.ONEHUNDRED_RON), "Initial state for 100 RON is faulty");


    }

    @Test
    public void multipleWithdrawalRequestsChecker(){
        AutomaticTellerMachine tester = new AutomaticTellerMachine();
        int[] bills = new int[5];
        tester.setATMState(10,9,5,1,1);

        setArray(bills, 0, 0, 0, 1, 1);
        assertArrayEquals(bills, tester.withdrawalRequest(150));

        setArray(bills, 0, 0, 5, 0, 0);
        assertArrayEquals(bills, tester.withdrawalRequest(50));

        setArray(bills, 5, 9, 0, 0, 0);
        assertArrayEquals(bills, tester.withdrawalRequest(50));


        tester.setATMState(10,9,5,3,10);

        setArray(bills, 3, 1, 1, 1, 9);
        assertArrayEquals(bills, tester.withdrawalRequest(968));
    }
}
