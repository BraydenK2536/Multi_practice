package Map;

import java.util.*;

public class test {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : list) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);

        int max = 0;
        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            entries.getValue();
            if (max < entries.getValue()) {
                max = entries.getValue();
            }
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            if (max == entries.getValue()) {
                System.out.println(entries.getKey() + " " + entries.getValue());
            }
        }

    }
}
