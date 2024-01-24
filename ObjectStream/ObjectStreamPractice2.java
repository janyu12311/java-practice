package com.yuanshen.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamPractice2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("..\\myIo\\oos1.txt"));
        Object o = ois.readObject();
        System.out.println(o);


    }
}
