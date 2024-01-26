package com.yuanshen.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class myPropertiesPractice1 {
    public static void main(String[] args) throws IOException {
        Properties pt=new Properties();

        pt.put("aaa","111");
        pt.put("bbb","222");
        pt.put("ccc","333");
        pt.put("ddd","444");
        FileOutputStream fos=new FileOutputStream("b.txt");
        pt.store(fos,"text");
        fos.close();

    }
}
