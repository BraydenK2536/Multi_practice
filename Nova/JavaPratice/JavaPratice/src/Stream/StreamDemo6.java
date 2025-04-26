package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A,23", "N,24", "q,56", "F,980", "F,9810", "F,1980", "QF,0");
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 24)
                .distinct()
                .collect(Collectors.toMap(
                        s -> s.split(",")[0], // 键：字符串的前半部分
                        s -> Integer.parseInt(s.split(",")[1]), // 值：字符串的后半部分转换为整数
                        Math::max // 合并函数：保留较大的值
                ));

        System.out.println(map);

    }
}
