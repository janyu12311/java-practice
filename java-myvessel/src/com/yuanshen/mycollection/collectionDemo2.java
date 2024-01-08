package com.yuanshen.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> collection=new ArrayList<>();

        Student s1=new Student(23,"zhangsan");
        Student s2=new Student(25,"lisi");
        Student s3=new Student(24,"Wangwu");

        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        Student s4=new Student(23,"zhangsan");
        boolean b = collection.contains(s4);
        System.out.println(b);
        System.out.println(collection.isEmpty());



    }
}
