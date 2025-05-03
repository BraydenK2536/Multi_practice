package IO.ObjectStream;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("AS","a",11);
        //利用对象输出流把学生对象写入到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\ObjectStream\\demo1.txt"));
        oos.writeObject(s);
        oos.close();
        //利用对象输入流把文件中的学生对象读取到内存中
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\ObjectStream\\demo1.txt"));
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
    }
}
