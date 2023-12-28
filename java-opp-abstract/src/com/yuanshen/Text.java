package com.yuanshen;

public class Text {
    public static void main(String[] args) {
    //Person p=new Person();

        Student s=new Student("张三",23);
        System.out.println(s.getName()+" "+s.getAge());
        s.work();
    }
}
