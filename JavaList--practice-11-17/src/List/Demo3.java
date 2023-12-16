package List;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("刻晴");
        list.add("爱莉希雅");
        list.add("芙宁娜");
        list.add("芙卡洛斯");
        
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1) {
                System.out.print(list.get(i) + "]");

            }else{
                System.out.print(list.get(i)+",");
            }
        }


    }
}
