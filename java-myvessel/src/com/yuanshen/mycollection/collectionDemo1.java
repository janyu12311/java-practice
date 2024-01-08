package com.yuanshen.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

//        coll.clear();
//        System.out.println(coll);
        coll.remove("aaa");
        System.out.println(coll);

        boolean b = coll.contains("bbb");
        System.out.println(b);

        System.out.println(coll.size());


    }
}
