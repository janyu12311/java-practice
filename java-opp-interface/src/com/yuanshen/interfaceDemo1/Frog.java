package com.yuanshen.interfaceDemo1;

public class Frog extends Animals implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃东西");


    }

    @Override
    public void Swim() {
        System.out.println("青蛙在游泳");

    }
}
