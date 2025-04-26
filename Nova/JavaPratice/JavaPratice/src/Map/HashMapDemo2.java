package Map;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if(map.containsKey(s)){
                Integer count = map.get(s);
                map.put(s,count + 1);
            }else {
                map.put(s,1);
            }
        }
        int max = 0;
        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            if(max < entries.getValue()){
                max = entries.getValue();
            }
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            if(max == entries.getValue()){
                System.out.println(entries.getKey() + " " + entries.getValue());
            }
        }
    }
}
