package test.SortTest;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("A", 3, 1.54);
        Person p2 = new Person("B", 30, 1.54);
        Person p3 = new Person("C", 3, 1.54);

        Person[] arr = {p1, p2, p3};

        Arrays.sort(arr, (Person o1, Person o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if(temp > 0){
                return 1;
            }else if(temp < 0){
                return -1;
            }else{
                return 0;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
