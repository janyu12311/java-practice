package com.yuanshen.StreamReader;

import java.io.*;

public class StreamReaderPractice1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("..\\myIo\\e.txt"),"GBK");
        osw.write("你好你好你好");
        osw.close();
        InputStreamReader isr=new InputStreamReader(new FileInputStream("..\\myIo\\e.txt"),"GBK");
        int len=0;
        while((len = isr.read())!= -1 ){
            System.out.print((char)len);
        }
    }
}
