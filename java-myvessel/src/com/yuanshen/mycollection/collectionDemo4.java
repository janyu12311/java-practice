package com.yuanshen.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class collectionDemo4 {
    public static void main(String[] args){
        Collection<String> co1=new ArrayList<>();
        co1.add("ZhangSan");
        co1.add("liSi");
        co1.add("wangWu");
        co1.forEach(s->System.out.println(s));
    }
}
