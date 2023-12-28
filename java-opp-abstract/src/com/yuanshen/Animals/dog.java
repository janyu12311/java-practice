package com.yuanshen.Animals;

public class dog extends Animals{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void behavior() {
        System.out.println("看家");
    }
}
