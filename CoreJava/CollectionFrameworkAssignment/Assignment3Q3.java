package CollectionFrameworkAssignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(21);
        arrayList.add(32);
        arrayList.add(46);
        arrayList.add(52);

        System.out.println("Elements Before Reversing : "+arrayList);

        traverseReverse(arrayList);


    }
    public static ArrayList<Integer> traverseReverse(ArrayList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size());
        System.out.println("\nElements After Using List Iterator: ");
        while (iterator.hasPrevious()){
           System.out.println(iterator.previous());
        }

        return list;
    }




}
