package OopsAssignment;

import java.util.ArrayList;

public class Assignment2Q3 {
    int cash;
    int totalCash;
    public int getCash(int cash){
        return cash;
    }
    public int totalCashInBank(ArrayList<Integer>cash){
        for (int x: cash)
        totalCash += x;
        return totalCash;

    }

    public static void main(String[] args) {
        Assignment2Q3 obj = new Assignment2Q3();

        Assignment2Q3 SA1 = new SavingsAccount();
        Assignment2Q3 SA2 = new SavingsAccount();
        Assignment2Q3 CA1 = new CurrentAccount();
        Assignment2Q3 CA2 = new CurrentAccount();

        ArrayList<Integer>cash = new ArrayList<>();
        cash.add(SA1.getCash(SA1.cash));
        cash.add(SA1.getCash(SA2.cash));
        cash.add(CA1.getCash(CA1.cash));
        cash.add(CA2.getCash(CA2.cash));

        System.out.println("New Deposits : "+cash);
        System.out.println("Total Cash in bank: "+obj.totalCashInBank(cash));
    }

}
class CurrentAccount extends Assignment2Q3{
    int totalDeposits = 10_000;
    int creditLimit = 2000;
    @Override
    public int getCash(int cash){
    int totalCurrentAccountCash;
    totalCurrentAccountCash = totalDeposits + creditLimit;
    return totalCurrentAccountCash;
    }
}

class SavingsAccount extends Assignment2Q3{
    int totalDeposits = 10_000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int cash){
        int totalSavingsAccountCash;
        totalSavingsAccountCash = totalDeposits+fixedDepositAmount;
        return totalSavingsAccountCash;
    }
}
