package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return transactions.stream().filter(i->i.getYear()==2011).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Transaction> a;
        List<Integer>aDelhi=new ArrayList<>();
        a=transactions.stream().filter(i->i.getTrader().getCity().contentEquals("Delhi")).collect(Collectors.toList());
        a.stream().forEach(i->aDelhi.add(i.getValue()));
        return aDelhi;    }


    public static int highestTransaction(List<Transaction> transactions){

        return transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
    }

    public static int smallestTransaction(List<Transaction> transactions){

        return transactions.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue();

    }

    public static void main(String[] args) {
        Traders a=new Traders("Sai", "Indore");
        Traders b=new Traders("Ram", "Delhi");
        Traders c=new Traders("Ravi", "Mumbai");
        Traders d=new Traders("King", "Delhi");
        Traders e=new Traders("Martin", "Bangalore");

        Transaction a1=new Transaction(a,2011,65000);
        Transaction b2=new Transaction(a,2016,11500);
        Transaction c3=new Transaction(b,2011,60000);
        Transaction d4=new Transaction(c,2011,105000);
        Transaction e5=new Transaction(d,2010,55000);
        Transaction f6=new Transaction(e,2009,75000);
        Transaction g7=new Transaction(b,2012,88000);

        List<Transaction> list= new ArrayList<>();
        list.add(a1);
        list.add(b2);
        list.add(c3);
        list.add(d4);
        list.add(e5);
        list.add(f6);
        list.add(g7);


        System.out.println("All Transactions in Year 2011");
        System.out.println(sortTransactions(list));

        System.out.println("\nAll Transactions from Traders living in Delhi");
        System.out.println(transactionsValuesDelhi(list));

        System.out.println("\nHighest Value of all Transactions");
        System.out.println(highestTransaction(list));

        System.out.println("\nTransactions with Smallest Value");
        System.out.println(smallestTransaction(list));



    }


}
class Traders {
    private String name;
    private String city;

    public Traders(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Traders{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
class Transaction {
    private Traders trader;
    private int year;
    private int value;

    public Transaction(Traders trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Traders getTrader() {
        return trader;
    }

    public void setTrader(Traders trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
