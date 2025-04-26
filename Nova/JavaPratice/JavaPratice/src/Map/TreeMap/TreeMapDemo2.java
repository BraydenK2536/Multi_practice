package Map.TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                return temp;
            }
        });

        Student s1 = new Student("S1",23);
        Student s2 = new Student("S2",213);
        Student s3 = new Student("S3",213);
        Student s4 = new Student("S4",2223);

        Student s5 = new Student("S4",2223);

        map.put(s1,"A");
        map.put(s2,"A");
        map.put(s3,"C");
        map.put(s4,"D");
        map.put(s5,"D");

        Set<Student> StudentMap = map.keySet();
        StudentMap.forEach(System.out::println);



    }
}
