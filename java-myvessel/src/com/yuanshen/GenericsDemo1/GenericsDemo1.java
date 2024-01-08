package com.yuanshen.GenericsDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(new Student("zhangsan",18));
        list.add("abc");
        Iterator it=list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(Object s:list){
            System.out.println(s);
        }

    }
}
