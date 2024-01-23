package com.yuanshen.ObjectIo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ObjectIoPractice2 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\桌面\\手术室\\aaa");
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(src.toString()+".zip")));
        toZip(src,zos,src.getName());

    }
    public static void toZip(File src, ZipOutputStream zos,String name) throws IOException {
        for (File file : src.listFiles()) {
            if(file.isFile()){
                ZipEntry zip=new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(zip);
                FileInputStream fis=new FileInputStream(file);
                int len=0;
                while((len = fis.read()) != -1){
                    zos.write(len);
                }
                fis.close();
                zos.closeEntry();
            }else{
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
