package com.yuanshen.BufferedIo;

import java.io.*;

public class BufferedIoPractice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\桌面\\手术室\\次数.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\桌面\\手术室\\次数.txt",true));
        bw.write("1");
        bw.flush();
        String brS=br.readLine();
        int len= brS.length();
        if(len<=3)
        {
            System.out.println("已经免费试用"+len+"次");
        }
        else
        {
            System.out.println("免费试用次数已用完");
        }
        bw.close();
        br.close();

    }
}
