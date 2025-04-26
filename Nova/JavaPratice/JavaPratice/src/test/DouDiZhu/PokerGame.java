package test.DouDiZhu;

import java.util.*;

public class PokerGame {
    static ArrayList<Integer> list = new ArrayList<>();
    //玩家手牌，地主牌牌盒初始化
    static TreeSet<Integer> player1 = new TreeSet<>(Comparator.reverseOrder());
    static TreeSet<Integer> player2 = new TreeSet<>(Comparator.reverseOrder());
    static TreeSet<Integer> player3 = new TreeSet<>(Comparator.reverseOrder());
    static TreeSet<Integer> lord = new TreeSet<>(Comparator.reverseOrder());
    static HashMap<Integer, String> map = new HashMap<>();

    static {
        //牌盒初始化
        String[] color = {"♠", "♥", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;

        for (String num : number) {
            for (String col : color) {
                list.add(serialNumber);
                map.put(serialNumber, col + num);
                serialNumber++;
            }
        }
        list.add(serialNumber);
        map.put(53,"JokerBlack");
        list.add(++serialNumber);
        map.put(54,"JokerRed");

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        dealCards();
        //看牌
        lookPoker("p1", player1);
        lookPoker("p2", player2);
        lookPoker("p3", player3);
        lookPoker("lord", lord);
    }

    private void dealCards() {
        for (int i = 0; i < list.size(); i++) {
            int poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
            } else {
                switch (i % 3) {
                    case 0:
                        player1.add(poker);
                        break;
                    case 1:
                        player2.add(poker);
                        break;
                    case 2:
                        player3.add(poker);
                        break;
                }
            }
        }
    }

    private void lookPoker(String name, TreeSet<Integer> set) {
        System.out.print(name + ":");
        for (int index : set) {
            String poker = map.get(index);
            System.out.print(poker + " ");
        }
        System.out.println();
    }


}
