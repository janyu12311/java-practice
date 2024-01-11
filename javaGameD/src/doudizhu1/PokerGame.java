package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static  ArrayList<String> list;
    static {
        String[] flo={"♣","♥","♦","♠"};
        String[] nums={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        list=new ArrayList<>();
        for (String s : flo) {
            for (String num : nums) {
                list.add(s+num);
            }
        }
        list.add("小王");
        list.add("大王");

    }
    public PokerGame(){
        Collections.shuffle(list);
        ArrayList<String> lord=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i<=2){
                lord.add(list.get(i));
            }else{
                if(i%3==0){
                    player1.add(list.get(i));
                }
                else if(i%3==1){
                    player2.add(list.get(i));
                }
                else{
                    player3.add(list.get(i));
                }
            }
        }
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);

    }
    public static void lookPoker(String people,ArrayList<String> list){
        System.out.print(people+":");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
