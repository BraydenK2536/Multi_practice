package Set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("John", 23);
        Student s2 = new Student("Johasdn", 203);
        Student s3 = new Student("Johdasn", 277);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);

    }
}
