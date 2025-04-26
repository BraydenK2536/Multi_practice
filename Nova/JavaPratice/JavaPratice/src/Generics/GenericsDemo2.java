package Generics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ListUtil.addAll(list, "A", "B", "C", "D");
        System.out.println(list);
    }
}
