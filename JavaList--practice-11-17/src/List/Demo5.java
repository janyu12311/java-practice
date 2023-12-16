package List;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
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
