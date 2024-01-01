package com.yuanshen.interclass.Demo3;

public class Test {
    public static void main(String[] args) {



        new Swim(){
            @Override
            public void show() {
                System.out.println("重写了游泳的方法");
            }
        };


        new Animals(){

            @Override
            public void eat() {
                System.out.println("重写了Animals的eat方法");
            }
        };

        method1(

                new Animals() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

    }

    public static void method1(Animals a){
        a.eat();
    }



}
