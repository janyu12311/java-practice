package List.Demo6;

import java.util.ArrayList;

public class Demo6Text {
    public static void main(String[] args) {
        ArrayList<Demo6> list=new ArrayList<>();
        list.add(new Demo6("刻晴",18));
        list.add(new Demo6("爱莉希雅",18));
        list.add(new Demo6("芙宁娜",18));
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1) {
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge() + "]");

            }else{
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge()+",");
            }
        }
    }
}
