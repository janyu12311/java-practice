package List;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean result = list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        boolean r1 = list.remove("aaa");
//        boolean r2 = list.remove("ddd");
//        String str=list.remove(0);
//        System.out.println(str);
//        System.out.println(result);
//        System.out.println(r1);
//        System.out.println(r2);
        //修改
//        String st2=list.set(1,"ddd");
//        System.out.println(st2);
        //查询
//        String str3=list.get(0);
//        System.out.println(str3);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
