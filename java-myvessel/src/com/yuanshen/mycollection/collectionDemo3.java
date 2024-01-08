package com.yuanshen.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo3 {
    public static void main(String[] args){
        Collection<String> co1=new ArrayList<>();
        co1.add("ZhangSan");
        co1.add("liSi");
        co1.add("wangWu");
        for(String s:co1){
            System.out.println(s);
        }


    }
}
