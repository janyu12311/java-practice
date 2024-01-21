package com.yuanshen.IoText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\桌面\\小说文献\\已经加密文件.txt");
        FileOutputStream fos=new FileOutputStream("D:\\桌面\\小说文献\\解密文件.txt");

        int len = 0;
        while((len = fis.read()) != -1){
            fos.write(len^127);
        }
        fos.close();
        fis.close();

    }
}
