package com.yuanshen.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamPractice1 {
    public static void main(String[] args) throws IOException {
        Student student=new Student("张三",32);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("..\\myIo\\oos1.txt"));
        oos.writeObject(student);
        oos.close();
    }
}
