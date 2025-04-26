package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "aaaaaa", "aaaaaaaaa", "aa", "aaaaaaaa", "aaaaa", "aaa"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        //Lambda
        Arrays.sort(arr, (String o1, String o2)-> o1.length() - o2.length()
        );



        System.out.println(Arrays.toString(arr));
    }
}
