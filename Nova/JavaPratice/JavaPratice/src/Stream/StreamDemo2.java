package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F");
        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        //map获取stream流
        map.entrySet().stream().forEach(System.out::println);
        map.keySet().stream().forEach(System.out::println);
        System.out.println("=============================================");

        //arr获取stream流
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("=============================================");
        String[] str = {"A", "B", "C", "D", "E", "F"};
        Stream.of(str).forEach(System.out::println);








    }
}
