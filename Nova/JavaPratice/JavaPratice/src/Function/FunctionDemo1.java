package Function;

import java.util.*;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] array = {5, 8, 6, 9, 7, 4, 1, 2, 10, 3};
        //方法引用标识符为::
        //引用静态方法类名::方法名
        System.out.println("=========================引用静态方法1=======================");
        //在static本类方法中引用非static本类方法时不能用this，只能创建本类对象后通过本类对象::方法名方式引用
        Arrays.sort(array, new FunctionDemo1()::subtractionNoStatic);
        System.out.println(Arrays.toString(array));
        //引用静态方法
        System.out.println("=========================引用静态方法2=======================");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        //引用成员方法
        System.out.println("=========================引用成员方法1=======================");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"Aqq","BEEQ","AC","LAS","AAA","aA");
        list2.stream().filter(StringOperation::stringJudge).forEach(System.out::println);
        System.out.println("=========================引用成员方法2=======================");
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"aaa","bbb","ccc","ddd","eee","fff");
        list3.stream().map(String::toUpperCase).forEach(System.out::println);

        list2.stream().toArray(String[]::new);






    }

    public static int subtraction(int a, int b) {
        return b - a;
    }

    public int subtractionNoStatic(int a, int b) {
        return b - a;
    }

}
