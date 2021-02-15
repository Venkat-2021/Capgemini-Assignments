package LambdaExpressionAssignments;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q2 {
    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }

    public static ArrayList<Assignment4Q2>listOfOrders(ArrayList<Assignment4Q2>orders){
        Predicate<Assignment4Q2> orderStatus = (O)->(O.totalPrice>10000 && ((O.status.contentEquals("Accepted")) ||
                (O.status.contentEquals("Completed"))));
        for (Assignment4Q2 s: orders ) {

            if (orderStatus.test(s)){
                System.out.println(s.toString());
            }
        }

        return orders;
    }

    public static void main(String[] args) {
        ArrayList<Assignment4Q2> orders = new ArrayList<>();
        orders.add(new Assignment4Q2(10000,"Accepted"));
        orders.add(new Assignment4Q2(8000,"Accepted"));
        orders.add(new Assignment4Q2(50000,"Completed"));
        orders.add(new Assignment4Q2(12500,"Accepted"));
        orders.add(new Assignment4Q2(3000,"Completed"));
        orders.add(new Assignment4Q2(10005,"Accepted"));
        orders.add(new Assignment4Q2(16000,"Declined"));

        listOfOrders(orders);

    }
}
