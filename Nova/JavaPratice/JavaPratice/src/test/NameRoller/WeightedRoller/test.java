package test.NameRoller.WeightedRoller;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
            rollName(students,100);
    }

    private static void rollName(ArrayList<Student> students,int attempts) throws IOException {
        if (attempts <= 0) {return;}
        BufferedReader br = new BufferedReader(new FileReader("test/WeightedRoller/name.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] studentMsg = line.split("-");
            students.add(new Student(studentMsg[0], studentMsg[1], Integer.parseInt(studentMsg[2]), Double.parseDouble(studentMsg[3])));
        }
        br.close();

        for (int index = 0; index < attempts; index++) {
            //计算总权重
            double weight = 0;
            for (Student student : students) {
                weight += student.getWeight();
            }
            //计算所有人的权重占比
            double[] arr = new double[students.size()];
            int i = 0;
            for (Student student : students) {
                arr[i] = student.getWeight() / weight;
                i++;
            }
            //计算每个人在0-1随机数中的区间
            for (int i1 = 1; i1 < arr.length; i1++) {
                arr[i1] = arr[i1] + arr[i1 - 1];
            }
            //通过随机数结果所在区间，用二分查找找到对应的人
            double random = Math.random();
            int i1 = -(Arrays.binarySearch(arr, random)) - 1;
            Student stu = students.get(i1);
            //将被抽中的人权重减半，重新写入文件
            stu.setWeight(stu.getWeight() / 2);
            BufferedWriter bw = new BufferedWriter(new FileWriter("test/WeightedRoller/name.txt"));
            for (Student student : students) {
                bw.write(student.getName() + "-" + student.getGender() + "-" + student.getAge() + "-" + student.getWeight());
                bw.newLine();
            }
            bw.close();
            System.out.println(stu.getName());
        }
    }
}
