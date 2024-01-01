package com.yuanshen.interclass.Demo5;

public class Outer {
    int b = 20;
    public void show(){
        int a = 10;

        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println(b);
                System.out.println("调用method1非静态方法");
            }
            public static void method2(){
                System.out.println("调用method2静态方法");
            }
        }
        Inner i=new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }

}
