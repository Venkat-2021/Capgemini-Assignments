package LambdaExpressionAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public List<String> convertToUpperCase(List<String>list){
        list.replaceAll(e->e.toUpperCase());
        return list;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hyderabad");
        list.add("Amaravati");
        list.add("TamilNadu");
        list.add("Mumbai");

        System.out.println("Actual List"+list);

        Assignment4Q6 obj = new Assignment4Q6();
        //Using Replace All Method
        obj.convertToUpperCase(list);

        System.out.println("Replace all Method"+list);

        UnaryOperator<String> listUnaryOperator = list1 ->list1.toUpperCase();
        list.replaceAll(listUnaryOperator);
        System.out.println("With UnaryOperator"+list);


    }

}
