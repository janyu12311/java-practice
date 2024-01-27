package com.yuanshen.ReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;

public class IoCharIoWritePractice2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("..\\myIo\\b.txt");
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.flush();
        fw.write("你好");
        fw.write("你好");
        fw.write("你好");
        fw.close();

    }
}
