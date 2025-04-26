package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1A");
        map.put("2", "2A");
        map.put("3","3A");
        //遍历map得到entry(键值对对象)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        entries.forEach(entry ->{
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
    }
}
