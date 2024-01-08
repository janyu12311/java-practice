package com.yuanshen.MyTree;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeDemo3 {
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                   int len=o1.length()-o2.length();
                   len=len==0?o1.compareTo(o2):len;
                   return len;
            }
        });

        ts.add("ab");
        ts.add("c");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
