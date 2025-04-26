package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student("A",51);
        Student s2 = new Student("B",501);
        Student s3 = new Student("C",510);
        Student s4 = new Student("A",51);


        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
