package ListOf;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C", "D", "E", "F", "G");
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");
        map.put("D", "D");
        map.put("E", "E");
        map.put("F", "F");
        map.put("G", "G");
        map.put("H", "H");
        map.put("I", "I");
        map.put("J", "J");
        map.put("K", "K");
        map.put("L", "L");
        map.put("M", "M");
        map.put("N", "N");
        map.put("O", "O");
        map.put("P", "P");
        map.put("Q", "Q");
        map.put("R", "R");
        map.put("S", "S");
        map.put("T", "T");
        map.put("U", "U");
        map.put("V", "V");
        map.put("W", "W");
        map.put("X", "X");
        map.put("Y", "Y");
        map.put("Z", "Z");
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        Map.Entry[] arr = entries.toArray(new Map.Entry[entries.size()]);
//        Map map1 = Map.ofEntries(arr);


        Map<Object, Object> map1 = Map.ofEntries(map.entrySet().toArray(new Map.Entry[0]));

        Map<String, String> map22 = Map.copyOf(map);
        map22.put("Aaa", "A");

    }
}
