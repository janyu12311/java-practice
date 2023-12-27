package com.yuanshen.codeblockdemo2.Demo2;

public class Student {
    private String name;
    private int age;
    static {
        System.out.println("我是构造代码块");
    }

    public Student() {
        System.out.println("我是空参构造");
    }

    public Student(String name, int age) {
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

}
