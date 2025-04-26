package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        /* 需求
        定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        添加完毕后，遍历结果格式如下：
        江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
        湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市*/

        Map<String, ArrayList> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(list2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(list3,"石家庄市","唐山市","邢台市","保定市","张家口市");

        map.put("江苏省", list1);
        map.put("湖北省", list2);
        map.put("河北省", list3);

        for (Map.Entry<String, ArrayList> entries : map.entrySet()) {
            ArrayList<String> listTemp = entries.getValue();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < listTemp.size(); i++) {
                sb.append(listTemp.get(i)).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            String city = sb.toString();
            System.out.println(entries.getKey() + " = " + city);
        }
    }
}
