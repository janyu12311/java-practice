package List;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();


        //添加元素，JDK5以后int和Integer是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

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
