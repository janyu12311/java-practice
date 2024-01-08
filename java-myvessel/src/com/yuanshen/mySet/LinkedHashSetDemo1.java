package com.yuanshen.mySet;

import javax.sound.sampled.Line;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

    public static void main(String[] args){
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",18);
        Student s3=new Student("王五",18);
        Student s4=new Student("张三",18);
        LinkedHashSet<Student> lhs=new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);

    }
}
