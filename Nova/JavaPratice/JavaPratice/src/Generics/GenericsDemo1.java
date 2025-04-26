package Generics;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList1<String> list = new ArrayList1<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);
    }
}
