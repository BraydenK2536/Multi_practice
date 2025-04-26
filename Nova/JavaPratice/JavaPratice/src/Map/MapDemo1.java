package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {


        Map<String, String> m = new HashMap<>();
        m.put("a", "S");
        m.put("aq", "daS");
        m.put("qa", "Sqq");
        m.put("assd", "Sasd");
//        System.out.println(m.put("a", "ssxxxxx"));

//        System.out.println(m.remove("qa"));

//        System.out.println(m.containsKey("a"));

//        System.out.println(m.containsValue("S"));

//        m.clear();

//        System.out.println(m.isEmpty());

        System.out.println(m.size());
        System.out.println(m);

    }
}
