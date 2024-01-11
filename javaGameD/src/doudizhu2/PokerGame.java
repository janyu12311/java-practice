package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        int curIndex = 1;
        String[] flo = {"♣", "♥", "♦", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String num : nums) {
            for (String s : flo) {
                hm.put(curIndex, s + num);
                list.add(curIndex);
                curIndex++;
            }
        }
        hm.put(curIndex, "小王");
        list.add(curIndex);
        curIndex++;
        hm.put(curIndex, "大王");
        list.add(curIndex);
        System.out.println(list);

    }

    public PokerGame() {
        Collections.shuffle(list);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
            } else if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);

    }

    //看牌
    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + ":");
        for (Integer i : list) {
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }


}
