package com.yuanshen.mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args){
        Set<String> s=new HashSet<>();

        //2.添加元素
        boolean r1 = s.add("张三");
        boolean r2=s.add("李四");
        boolean r3=s.add("李四");
        boolean r4=s.add("李四");
        System.out.println(s);
//        Iterator<String> it=s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(String e:s){
            System.out.println(e);
        }


    }
}
