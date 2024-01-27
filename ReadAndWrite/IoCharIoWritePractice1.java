package com.yuanshen.ReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;

public class IoCharIoWritePractice1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("..\\myIo\\b.txt",true);

        char[] chars={'\n','a','b','c'};
        fw.write(chars,0,4);

        fw.close();

    }
}
