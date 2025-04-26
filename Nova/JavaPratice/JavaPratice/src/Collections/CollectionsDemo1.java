package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "Q", "C", "D", "E", "F", "H", "H", "I", "B", "K", "L", "S", "N");
//        System.out.println(list);
//        System.out.println("-----------------------------------");
//        Collections.shuffle(list);
//        System.out.println(list);
//        System.out.println("-----------------------------------");
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println("-----------------------------------");
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "E"));

//        Collections.fill(list, "Eaaaaaaaaa");
//        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(list, 0, 1);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
