package StreamAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Assignment5Q1 {
    public static List<String> reverseSort(ArrayList<Fruit>fruits){
        return fruits.stream().filter(fruit -> fruit.getCalories()<100)
                .sorted(comparing(Fruit::getCalories)).map(Fruit::getName).collect(Collectors.toList());

    }
    public static  Map<Object, List<Fruit>> Sort(List<Fruit> fruits){
        return fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.getColor()));
    }

    public static ArrayList<Fruit> filterRedSortPrice(List<Fruit> fruits) {
        return (ArrayList<Fruit>) fruits.stream().filter(fruit -> fruit.getColor().equals("Red"))
                .sorted(comparing(Fruit::getPrice))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        Fruit a = new Fruit("Apple",152,200,"Red");
        Fruit b = new Fruit("Banana",89,50,"Yellow");
        Fruit c = new Fruit("Cherries",50,80,"Red");
        Fruit d = new Fruit("Grapes",167,60,"Green");
        Fruit e = new Fruit("Pineapple",105,80,"Greenish-Yellow");
        Fruit f = new Fruit("Watermelon",125,120,"Green");

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(a);
        fruits.add(b);
        fruits.add(c);
        fruits.add(d);
        fruits.add(e);
        fruits.add(f);
        System.out.println(fruits);

        System.out.println("===Fruits with Calories<100===");
        reverseSort(fruits).forEach(System.out::println);

        System.out.println("\n===Fruits Sort By Colour===");
        System.out.println(Sort(fruits));

        System.out.println("\n===Fruits With RED Colour Sort By Price===");
        filterRedSortPrice(fruits).forEach(System.out::println);


    }
}
class Fruit{
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
