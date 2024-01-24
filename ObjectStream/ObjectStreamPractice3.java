package com.yuanshen.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamPractice3 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("..\\myIo\\oos2.txt"));
        Cat cat1=new Cat("小黑",12);
        Cat cat2=new Cat("小红",13);
        Cat cat3=new Cat("小蓝",14);
        ArrayList<Cat> list=new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        oos.writeObject(list);
        oos.close();
    }
}
