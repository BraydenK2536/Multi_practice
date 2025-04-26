package Set.TreeSetDemo4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        Student s1 = new Student("Aqs", 512, 784, 63, 15);
        Student s2 = new Student("BASqs", 572, 478, 763, 15);
        Student s3 = new Student("VAAqs", 552, 748, 637, 15);
        Student s4 = new Student("UAqs", 582, 778, 763, 15);
        Student s5 = new Student("KAqs", 528, 788, 63, 15);

        TreeSet<Student> ts = new TreeSet<>((o1, o2) -> {
            int CountScore1 = o1.getChineseScore() + o1.getMathScore() + o1.getEnglishScore();
            int CountScore2 = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore();
            int temp = CountScore1 - CountScore2;
            temp = temp == 0 ? o1.getChineseScore() - o2.getChineseScore() : temp;
            temp = temp == 0 ? o1.getMathScore() - o2.getMathScore() : temp;
            temp = temp == 0 ? o1.getEnglishScore() - o2.getEnglishScore() : temp;
            temp = temp == 0 ? o1.getAge()- o2.getAge() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            return temp;
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);
    }
}
