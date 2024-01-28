package com.yuanshen.StreamReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class StreamReaderPractice2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("..\\myIo\\e.txt", Charset.forName("GBK"));
        int len=0;
        while((len = fr.read()) != -1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
