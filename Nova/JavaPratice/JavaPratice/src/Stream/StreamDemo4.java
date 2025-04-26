package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A-男-21", "B-男-54", "Ba-女54", "aB-女-54", "asB-女-54", "asddB-男-54", "asddB-男-54", "Bdasd-男-54", "qqqB-女-54", "d-女-54");
        List<String> list1 = list.stream().filter(s -> s.contains("男")).toList();
        System.out.println(list1);
        Map<String, Integer> map = list.stream().filter(s -> s.contains("男")).distinct().collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> Integer.parseInt(s.split("-")[2]))
        );
        System.out.println(map);
    }
}
