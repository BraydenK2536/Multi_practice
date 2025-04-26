package Map.HashMapDemo1;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("S1", 1);
        Student s2 = new Student("S2", 2);
        Student s3 = new Student("S3", 3);
        Student s4 = new Student("S3", 3);

        HashMap<Student,String> map = new HashMap<>();

        map.put(s1,"value1");
        map.put(s2,"value2");
        map.put(s3,"value3");
        System.out.println(map.put(s4, "value4"));

        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
