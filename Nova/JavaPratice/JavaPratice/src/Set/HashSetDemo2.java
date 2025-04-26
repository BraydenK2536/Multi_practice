package Set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("A",51);
        Student s2 = new Student("B",501);
        Student s3 = new Student("C",510);
        Student s4 = new Student("A",51);

        HashSet<Student> set = new HashSet<>();

        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));

        System.out.println(set);
    }
}
