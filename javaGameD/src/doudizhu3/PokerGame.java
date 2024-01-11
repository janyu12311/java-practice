package doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    static ArrayList<String> list;
    static HashMap<String,Integer> hm;
    static {
        String[] flo = {"♣", "♥", "♦", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        list = new ArrayList<>();
        hm=new HashMap<>();
        for (String s : flo) {
            for (String num : nums) {
                list.add(s + num);
            }
        }
        list.add(" 小王");
        list.add(" 大王");
       hm.put("J",11);
       hm.put("Q",12);
       hm.put("K",13);
       hm.put("A",14);
       hm.put("2",15);
       hm.put("小王",16);
       hm.put("大王",17);
    }

    public PokerGame() {
        Collections.shuffle(list);
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else {
                    player3.add(list.get(i));
                }
            }
        }
        order(lord);
        order(player1);
        order(player2);
        order(player3);
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }
    public static void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1=o1.substring(0,1);
                int value1=getValue(o1);
                String color2=o2.substring(0,1);
                int value2=getValue(o2);
               return value1==value2?color1.compareTo(color2):value1-value2;
            }
        });
    }

    public static int getValue(String s){
        String str=s.substring(1);
        if(hm.containsKey(str)){
            return hm.get(str);
        }else{
            return Integer.parseInt(str);
        }
    }
    public static void lookPoker(String people,ArrayList<String> list){
        System.out.print(people+":");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }



}
