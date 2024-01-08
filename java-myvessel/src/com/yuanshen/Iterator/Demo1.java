package com.yuanshen.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        Iterator<String> it=collection.iterator();
        String str=it.next();
        String str1=it.next();
        System.out.println(str1);






    }
}
