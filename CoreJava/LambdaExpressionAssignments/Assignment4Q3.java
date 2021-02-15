package LambdaExpressionAssignments;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {

    static class Product{
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    static void display(Supplier<Product> supplier){
        Product product = supplier.get();
        System.out.println("===Supplier Interface===");
        System.out.println(product.toString());

    }
    static void modifyValue(int a, Function<Integer,Double> function){
        double result = function.apply(a);
        System.out.println(result);

    }

    public static void main(String[] args) {

        //Supplier Interface
        display(() -> new Product("Television",30000));

        //Consumer Interface

        System.out.println("\n===Consumer Method===");
        Consumer<Product> consumer = (product)-> System.out.println(product.toString());
        consumer.accept(new Product("Refrigerator",25000));

        //Predicate Interface

        System.out.println("\n===Predicate Interface");
        Predicate<Product> productPredicate =(product -> product.price<30000);
        boolean result = productPredicate.test(new Product("Refrigerator",25000));
        System.out.println(result);

        //Function Interface
        System.out.println("\n===Function Interface");
        int a = 5;
        modifyValue(a,value-> (double) (value * 10));
        modifyValue(a,value-> (double) (value / 10));

    }
}
