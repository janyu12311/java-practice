package com.yuanshen.Animals;

public abstract class Animals {
    public String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void behavior();
    public void drink(){
        System.out.println("喝水");
    }
}
