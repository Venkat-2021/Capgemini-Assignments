package CollectionFrameworkAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Q8a {


    public static void failFast(Map<String,String>cityCode){

        for (String s : cityCode.keySet()) {
            System.out.println(cityCode.get(s));

            //Adding new Element throws an Exception
            cityCode.put("Manipur","Impal");
        }

    }

    public static void main(String[] args) {
        Map<String,String> cityCode = new HashMap<>();
        cityCode.put("Andhra Pradesh","Amaravati");
        cityCode.put("Goa","Panaji");
        cityCode.put("Maharashtra","Mumbai");

        failFast(cityCode);

    }
}
