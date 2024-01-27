package com.yuanshen.ReadAndWrite;

import java.io.FileReader;
import java.io.IOException;

public class IoReadPractice1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("..\\myIo\\b.txt");

        char[] chars=new char[2];

        int len = 0;
        while((len = fr.read(chars) )!=-1)
        {
            System.out.print(new String(chars,0,len));
        }
        fr.close();

    }
}
