package com.yuanshen.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class myPropertiesPractice2 {
    public static void main(String[] args) throws IOException {
        Properties pt=new Properties();
        FileInputStream fis=new FileInputStream("a.properties");
        pt.load(fis);
        fis.close();
        System.out.println(pt);
    }
}
