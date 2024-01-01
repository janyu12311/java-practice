package com.yuanshen.interclass.Demo3;

public class Test2 {
    public static void main(String[] args) {
        new Swim() {

            @Override
            public void show() {
                System.out.println("重写后的内部类");
            }
        }.show();

        Swim s = new Swim() {
            @Override
            public void show() {
                System.out.println("接口多态中重写的内部类");
            }
        };
        s.show();


    }
}
