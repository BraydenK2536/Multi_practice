package List.ListDemo1;


import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();

       list.add("A");
       list.add("B");
       list.add("C");
//       list.add(1,"asd");

//        System.out.println(list.remove(0));

//        System.out.println(list.set(0, "D"));

        System.out.println(list.get(0));
        System.out.println(list);

    }
}
