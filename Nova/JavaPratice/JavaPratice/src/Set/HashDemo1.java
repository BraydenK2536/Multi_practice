package Set;

public class HashDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("A",51);
        Student s2 = new Student("A",51);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
