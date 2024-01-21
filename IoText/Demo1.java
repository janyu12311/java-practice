package com.yuanshen.IoText;
import java.io.*;
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\桌面\\手术室\\aaa");
        File dest=new File("D:\\桌面\\手术室\\des");
        copyDir(src,dest);
    }
    public static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file :files) {
              if(file.isFile()){
                  FileOutputStream fos=new FileOutputStream(new File(dest, file.getName()));
                  FileInputStream fis=new FileInputStream(file);
                  byte[] bytes=new byte[1024];
                  int len=0;
                  while((len = fis.read(bytes))!= -1){
                      fos.write(bytes,0,len);
                  }
                  fis.close();
                  fos.close();
              }else {
                  copyDir(file,new File(dest, file.getName()));
              }
        }


    }

}
