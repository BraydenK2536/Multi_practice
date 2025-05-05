package test.NameRoller.RollNameTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RollNameDemo2 {
    public static void main(String[] args) {
        //被点过的不会在点到
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> studentList2 = new ArrayList<>();
        Random rand = new Random();
        Collections.addAll(studentList, "A1", "A2", "A3", "A4", "A5", "A6");
        int count = studentList.size();
        for (int j = 0; j < 10; j++) {
            System.out.println("===============第" + (j + 1) + "轮点名开始===============");
            //实现1
//            for (int i = 0; i < count; i++) {
//                int index = rand.nextInt(studentList.size());
//                String name = studentList.get(index);
//                studentList.remove(name);
//                studentList2.add(name);
//                System.out.println(name);
//            }
//            studentList.addAll(studentList2);
//            studentList2.clear();
            //实现2
            Collections.shuffle(studentList);
            for (String s : studentList) {
                System.out.println(s);
            }
        }
    }
}
