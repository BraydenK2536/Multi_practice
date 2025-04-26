package Map.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {

        String s = "asdasdawedzsdfgdfyjfgyhjmfcythjstrfhjsdrtyuhjdrftyjdfgyj";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

    }
}
