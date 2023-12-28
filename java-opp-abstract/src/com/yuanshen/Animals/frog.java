package com.yuanshen.Animals;

public class frog extends Animals{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void behavior() {
        System.out.println("吃虫子");
    }
}
