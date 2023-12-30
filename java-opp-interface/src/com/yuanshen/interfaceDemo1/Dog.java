package com.yuanshen.interfaceDemo1;

public class Dog extends Animals implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

        System.out.println("狗在吃东西");
    }

    @Override
    public void Swim() {
        System.out.println("狗在游泳");

    }
}
