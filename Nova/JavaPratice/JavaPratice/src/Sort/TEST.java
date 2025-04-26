package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class TEST {
    public static void main(String[] args) {
        Integer[] arr = {5,8,3,6,1,2,9,7,10,4};
        Arrays.sort(arr,(Integer o1, Integer o2)-> {
                    return o2 - o1;
                }
        );



        System.out.println(Arrays.toString(arr));
    }
}
