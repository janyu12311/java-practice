package com.yuanshen.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("eee");
        Iterator<String> it=collection.iterator();
//        String str=it.next();
//        String str1=it.next();
//        System.out.println(str1);
        while(it.hasNext())
        {
            String str=it.next();
            if(str.equals("bbb"))
            {
                it.remove();
            }
        }
        System.out.println(collection);





    }
}
