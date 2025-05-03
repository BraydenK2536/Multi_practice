package IO.ObjectStream;

import java.io.*;
import java.io.*;
import java.util.ArrayList;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化多个对象，但是个数不确定，所以用集合存储，再序列化集合
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("AS","a",11);
        Student s2 = new Student("BAS","QQQa",1551);
        Student s3 = new Student("XCAS","SAEDGa",1111);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo2.txt"));
        oos.writeObject(students);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo2.txt"));
        ArrayList<Student> students2 = (ArrayList<Student>) ois.readObject();
        ois.close();
        for (Student student : students2) {
            System.out.println(student);
        }
    }
}
