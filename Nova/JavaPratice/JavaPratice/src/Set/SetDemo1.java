package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean r1 = set.add("4");
        boolean r2 = set.add("3");
        set.add("2");
        set.add("1");

        System.out.println(r1 + " " + r2);
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

        set.forEach(System.out::println);
    }
}
