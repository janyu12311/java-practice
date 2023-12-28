package com.yuanshen.Animals;

public class sheep extends Animals{
    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void behavior() {
        System.out.println("吃草");
    }
}
