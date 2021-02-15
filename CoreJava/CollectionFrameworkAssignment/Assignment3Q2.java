package CollectionFrameworkAssignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("SAI");
        set.add("RAVI");
        set.add("RAM");

        HashSet<String> set1 = new HashSet<>();
        set1.add("SAI");
        set1.add("RAVI");
        set1.add("RAM");

        System.out.println("Linked Hashset");
        ordered(set);

        System.out.println("HashSet");
        unordered(set1);
    }
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        return linkedHashSet;

    }

    public static HashSet<String> unordered(HashSet<String> hashSet){
        for (String s : hashSet) {
            System.out.println(s);
        }
        return hashSet;

    }
}
