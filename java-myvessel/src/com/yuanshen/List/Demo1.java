package com.yuanshen.List;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        list.add(1,"qqq");
        System.out.println(list);
        StringBuilder stringBuilder=new StringBuilder("abc");
        stringBuilder.reverse();
        Integer n2=Integer.valueOf(stringBuilder.toString());

        String str=list.remove(0);
        System.out.println(str);
        System.out.println(list);

    }
}
