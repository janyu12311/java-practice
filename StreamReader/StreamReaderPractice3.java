package com.yuanshen.StreamReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamReaderPractice3 {
    public static void main(String[] args) throws IOException {
/*
        FileInputStream fis=new FileInputStream("..\\myIo\\b.txt");
        int len=0;
        while((len = fis.read()) != -1){
            System.out.print((char)len);
        }
        fis.close();
 */
        FileReader fr=new FileReader("..\\myIo\\b.txt");
        int len=0;
        while((len = fr.read()) != -1){
            System.out.print((char)len);
        }

    }
}
