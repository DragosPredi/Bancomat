package main;

public class Driver {

    /**
     * Helper function to complete the transaction, it takes an ATM obj
     * and prints the bills used
     * @param ATM -> ATM object
     */
    public static void transaction(AutomaticTellerMachine ATM){

        int cashAmount;
        do {
            cashAmount = Utils.readPositiveInt();
        } while (cashAmount <= 0);

        Utils.printBills(ATM.withdrawalRequest(cashAmount));
        CashManager.checkATMBalance(ATM);
    }

    public static void main(String[] args) {
        AutomaticTellerMachine ATM = new AutomaticTellerMachine();
        do {
            System.out.println("What sum would you like to withdraw? Please enter a positive number");
            transaction(ATM);
            System.out.println("Thank you for choosing our services, would you like to try again? (yes/no)");
        } while (Utils.readString().equals("yes"));

    }
}
