package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("1", "1A");
        map.put("2", "2A");
        map.put("3", "3A");

        Set<String> keys = map.keySet();
        //map遍历1
//        for (String key : keys) {
//            System.out.println(key + "=" + map.get(key));
//        }

        //map遍历2
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            String value = map.get(key);
//            System.out.println(key + "=" + value);
//        }


        //map遍历3
        keys.forEach(System.out::println);

    }
}
