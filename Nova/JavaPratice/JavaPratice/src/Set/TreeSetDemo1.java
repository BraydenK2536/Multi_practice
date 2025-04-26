package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1231);
        ts.add(2213);
        ts.add(31);
        ts.add(4321);
        ts.add(1235);

//        System.out.println(ts);

//        Iterator<Integer> it = ts.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//        for (Integer t : ts) {
//            System.out.println(t);
//        }

        ts.forEach(System.out::println);


    }
}
