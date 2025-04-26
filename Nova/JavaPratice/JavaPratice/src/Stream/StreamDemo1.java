package Stream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("Baa");
        list.add("CDS");
        list.add("ADQQ");
        list.add("AqE");
        list.add("AF");
        //Stream流
        list.stream().filter(name -> name.startsWith("A")).filter(name -> name.length() == 3).forEach(System.out::println);


















//        //旧方法
//        ArrayList<String> list2 = new ArrayList<>();
//
//        for (String s : list) {
//            if(s.startsWith("A")) {
//                list2.add(s);
//            }
//        }
//
//        System.out.println(list2);
//
//        ArrayList<String> list3 = new ArrayList<>();
//        for (String s : list2) {
//            if(s.length() == 3) {
//                list3.add(s);
//            }
//        }
//        System.out.println(list3);
//
//



    }
}
