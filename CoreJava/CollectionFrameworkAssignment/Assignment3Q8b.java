package CollectionFrameworkAssignment;

import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static void  failSafe(CopyOnWriteArrayList<Integer>list){
        for (Integer integer : list) {
            if (integer.equals(6)) {
                //Adding Element will not throw Error
                list.add(8);
            }
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1,2,3,4,5,6});
        failSafe(list);

    }
}
