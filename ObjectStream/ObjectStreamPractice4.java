package com.yuanshen.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamPractice4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("..\\myIo\\oos2.txt"));
        ArrayList<Cat> list =(ArrayList<Cat>) ois.readObject();
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }
}
