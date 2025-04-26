package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamDemo5 {
    public static void main(String[] args) {
        //需求：stream流过滤奇数留下偶数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(s -> s% 2 == 0).collect(Collectors.toList());

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).filter(s -> s% 2 == 0).boxed().toList();
    }
}
