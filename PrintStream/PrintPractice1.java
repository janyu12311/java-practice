package com.yuanshen.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintPractice1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream(new FileOutputStream("..\\myIo\\a.txt"));
        ps.println(true);
        ps.println(97);
        ps.println("你好你好");
        ps.printf("%d %d",18,19);
        ps.close();
    }
}
