package test.RollNameTest;

import java.util.*;

public class RollNameDemo1 {
    public static void main(String[] args) {
        //男生70%，女生30%
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random random = new Random();
        int roll = list.get(random.nextInt(list.size()));
        int index = list.get(roll);
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"boy1", "boy2", "boy3", "boy4", "boy5", "boy6");
        Collections.addAll(girlList,"girl1", "girl2", "girl3", "girl4");
        if (roll == 1) {
            System.out.println(boyList.get(random.nextInt(boyList.size())));
        }else if (roll == 0) {
            System.out.println(girlList.get(random.nextInt(girlList.size())));
        }


    }
}
