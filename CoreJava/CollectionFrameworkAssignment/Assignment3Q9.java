package CollectionFrameworkAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Assignment3Q9 {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(50000,101,"SAI",true);
        SavingAccount b = new SavingAccount(10500,102,"RAJU",true);
        SavingAccount c = new SavingAccount(205500,103,"RAVI",true);
        SavingAccount d = new SavingAccount(165050,104,"MARTIN",true);
        SavingAccount e = new SavingAccount(15515,105,"KING",true);

        BankAccountList accountList = new BankAccountList();
        accountList.addSavingAccount(a);
        accountList.addSavingAccount(b);
        accountList.addSavingAccount(c);
        accountList.addSavingAccount(d);
        accountList.addSavingAccount(e);


        accountList.displaySavingAccountIds();
    }

}
class SavingAccount implements Comparable<SavingAccount> {
    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean inSalaryAccount;

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean inSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.inSalaryAccount = inSalaryAccount;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isInSalaryAccount() {
        return inSalaryAccount;
    }

    public void setInSalaryAccount(boolean inSalaryAccount) {
        this.inSalaryAccount = inSalaryAccount;
    }

    public double withdraw(double drawMoney){
        acc_balance = acc_balance-drawMoney;
        return acc_balance;
    }

    public double deposit(double depositAmount){
        acc_balance = acc_balance + depositAmount;
        return acc_balance;
    }

    @Override
    public int compareTo( SavingAccount o) {
        if (acc_ID>o.acc_ID){
            return 1;
        }
        else {
        return 0;}
    }
}
class BankAccountList{
    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    boolean addSavingAccount(SavingAccount savingAccount){
       savingAccounts.add(savingAccount);
        return true;
    }
    public List<Integer> displaySavingAccountIds(){
        List<Integer> list = new ArrayList<>();
        for (SavingAccount s : savingAccounts){
            list.add(s.getAcc_ID());
            System.out.println(s.getAcc_ID());
        }
        return null;
    }
}
