package com.yuanshen.interclass.Demo2;

public class test {
    public static void main(String[] args) {
//        Outer.Inner i=new Outer().new Inner();
//        System.out.println(new Outer().name);
        Outer.Inner o=new Outer.Inner();
        o.show2();
        Outer.Inner.show1();

    }
}
