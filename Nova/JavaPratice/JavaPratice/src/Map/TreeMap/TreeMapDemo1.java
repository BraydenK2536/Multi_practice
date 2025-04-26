package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>((o1, o2) -> o1 - o2);
        map.put(1,"A");
        map.put(12,"B");
        map.put(3,"aaC");
        map.put(4,"AD");

        System.out.println(map);


    }
}
