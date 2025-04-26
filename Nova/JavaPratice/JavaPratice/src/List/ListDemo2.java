package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        //迭代器
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next().equals("A")){hh
//                iterator.remove();
//            }
//        }
//        System.out.println(list);

        //增强for
//        for (String s : list) {
//            System.out.println(s);
//        }

        //lambda
//        list.forEach(System.out::println);

        //列表迭代器
//        ListIterator<String> it = list.listIterator();
//        while (it.hasNext()) {
//            String next = it.next();
//            if(next.equals("A")) {
//                it.add("D");
//            }
//        }
//        System.out.println(list);

    }
}
