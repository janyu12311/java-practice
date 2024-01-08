package com.yuanshen.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        Iterator<String> iterator=list.iterator();
//        while(iterator.hasNext()){
//            String str=iterator.next();
//            System.out.println(str);
//        }
//        for(String s:list){
//            System.out.println(s);
//        }
//        list.forEach((String s)->{
//                System.out.println(s);
//            });
        outer:for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("bbb")) {
                list.add(i, "ddd");
                break outer;
            }
            }
            System.out.println(list);
        }


    }

