package com.yuanshen.mySet;

public class HashSetDemo1 {
    public static void main(String[] args){
        Student s1=new Student("刻晴",18);
        Student s2=new Student("刻晴",18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
