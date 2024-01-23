package com.yuanshen.ObjectIo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ObjectIoPractice1 {
    public static void main(String[] args) throws IOException {

        File src=new File("D:\\桌面\\手术室\\aaa.zip");
        File dest=new File("D:\\桌面\\手术室");
        unfoldZip(src,dest);
    }
    public static void unfoldZip(File src,File dest) throws IOException {
        ZipInputStream zis=new ZipInputStream(new FileInputStream(src));
        ZipEntry zip;
        while((zip = zis.getNextEntry()) != null){
            if(zip.isDirectory()){
                File file=new File(dest,zip.getName());
                file.mkdirs();
            }else{
                FileOutputStream fos=new FileOutputStream(new File(dest,zip.getName()));
                int len=0;
                while((len = zis.read()) != -1){
                    fos.write(len);
                }
                fos.close();
                zis.closeEntry();
            }
        }

    }
}
