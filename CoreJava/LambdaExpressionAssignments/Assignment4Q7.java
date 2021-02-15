package LambdaExpressionAssignments;

import java.util.HashMap;

public class Assignment4Q7 {
    public String convertKeyValueToString(HashMap<String,Integer>map){
        StringBuilder hashMapAsString = new StringBuilder();
        map.forEach((a,b)->hashMapAsString.append(a).append(b));
        return hashMapAsString.toString();

    }

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hyderabad",1);
        hashMap.put("Mumbai",2);
        hashMap.put("Delhi",3);

        System.out.println(hashMap);

        Assignment4Q7 obj = new Assignment4Q7();
        System.out.println(obj.convertKeyValueToString(hashMap));

    }

}
