package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) {
        return traders.stream().map(t->t.getCity()).distinct().collect(Collectors.toList());
    }

    public static List<Trader> tradersFromPuneSortByName(List<Trader> traders) {

        return traders.stream().filter(t -> t.getCity().equals("Pune")).distinct().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
    }
    public static String allTrader3Names(List<Trader> traders) {

        return traders.stream().map(t -> t.getName()).distinct().sorted().reduce("", (n1, n2) -> n1 + n2);
    }
    public static boolean areAnyTradersFromIndore(ArrayList<Trader> traders) {
        return traders.stream().anyMatch(t -> t.getCity().equals("Indore"));
    }
    public static void main(String[] args) {
        Trader a=new Trader("Sai", "Indore");
        Trader b=new Trader("Ram", "Pune");
        Trader c=new Trader("Ravi", "Mumbai");
        Trader d=new Trader("King", "Pune");
        Trader e=new Trader("Martin", "Bangalore");
        Trader f=new Trader("Raju", "Indore");
        Trader g=new Trader("Naveen", "Indore");

        ArrayList<Trader> traders= new ArrayList<>();

        traders.add(a);
        traders.add(b);
        traders.add(c);
        traders.add(d);
        traders.add(e);
        traders.add(f);
        traders.add(g);

        System.out.println("\n===Unique Cities===");
        System.out.println(printUniqueCities(traders));

        System.out.println("\n===Traders from Pune===");
        System.out.println(tradersFromPuneSortByName(traders));

        System.out.println("\n===Traders Names===");
        System.out.println(allTrader3Names(traders));

        System.out.println("\n===Traders from Indore===");
        System.out.println(areAnyTradersFromIndore(traders));
    }

}
class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
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
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
