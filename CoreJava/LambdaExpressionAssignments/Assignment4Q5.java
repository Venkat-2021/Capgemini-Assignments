package LambdaExpressionAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    public static String processWords(List<String>list){
        StringBuilder firstletter = new StringBuilder();
        list.forEach(s -> firstletter.append(s.substring(0,1)));
        System.out.println(firstletter.toString());

        return null;
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Consumer<List<String>> listConsumer = Assignment4Q5::processWords;
        listConsumer.accept(list);

    }
}
