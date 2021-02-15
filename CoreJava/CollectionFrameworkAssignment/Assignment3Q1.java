package CollectionFrameworkAssignment;

import java.util.TreeSet;

public class Assignment3Q1 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        Person a = new Person("SAI",5,55);
        Person b = new Person("RAVI",6,80);
        Person c = new Person("RAM",5,75);
        Person d = new Person("RAGHU",4,65);
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);
        treeSet.add(d);

        System.out.println(treeSet.toString());

    }

}
class Person implements Comparable<Person> {
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo( Person o) {
        if (weight>o.weight){
            return 1;
        }
        else if (weight<o.weight){
            return -1;
        }
        else {
            if (height > o.height) {
                return 1;
            }
            else if (height<o.height){
                return -1;
            }

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

