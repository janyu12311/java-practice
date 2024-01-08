package com.yuanshen.GenericsDemo1;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
    }
}
