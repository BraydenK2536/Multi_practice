package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list, "AAA", "A-B", "1-C", "AA-SD", "X-CE", "DF", "GF", "GF", "GF", "GF", "GF", "GF", "GF","1C","1C");
        Collections.addAll(list1,"A-13","@!-312");

        //filter
        System.out.println("==================filter================");
        list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("====================limit===============");
        //limit
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("===================skip========================");
        //skip
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("==========================================");
        //需求，输出list3,4索引数据"AASD", "XCE"
        list.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("==============distinct去重=================");
        //distinct去重
        list.stream().distinct().forEach(System.out::println);
        System.out.println("===================concat合并stream流=======================");
        //concat合并stream流
        Stream.concat(list.stream(), list1.stream()).distinct().forEach(System.out::println);
        System.out.println("================map转换流内数据类型===============");
        //map转换流内数据类型
        list1.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
        System.out.println("===============count==================");
        //count
        System.out.println(list.stream().count());
        //toArray
        System.out.println("=============================toArray===================");
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));


    }
}
