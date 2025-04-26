package Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionDemo2 {
    public static void main(String[] args) {
        //引用构造方法
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A,25","B,87","C,54");

        List<Student> newList = list.stream().map(Student::new).toList();
        newList.forEach(System.out::println);

    }
}
