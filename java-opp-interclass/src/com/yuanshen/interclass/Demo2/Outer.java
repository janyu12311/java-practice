package com.yuanshen.interclass.Demo2;

public class Outer {
    String name;
    static int b=10;
    int a=20;
    static class Inner{
        public static void show1(){
            System.out.println("调用静态方式");
        }
        public void show2(){
            System.out.println("调用非静态方式");
        }
    }

//    public Inner getInstance(){
//        return new Inner();
//    }

}
