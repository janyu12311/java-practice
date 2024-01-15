package com.yuanshen.GetNameRandom;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\桌面\\手术室\\姓名.txt"));
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        String s;
        PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while((s = br.readLine()) != null){
            if(s.split("-")[1].equals("男")){
                boyList.add(s);
            }else{
                girlList.add(s);
            }
        }
        int boyNum=0;
        int girlNum=0;
        Random r=new Random();

        for (int i=0;i<=1000000;i++) {
            int tmp1=r.nextInt(10)+1;
            if (1 <= tmp1 && tmp1 <= 7) {
                pw.println(boyList.get(r.nextInt(boyList.size())) .split("-")[0]);
                boyNum++;
            } else {
                pw.println(girlList.get(r.nextInt(girlList.size())) .split("-")[0]);
                girlNum++;
            }
        }
        System.out.println((double)(1.0*girlNum/1000000));
        System.out.println((double)(1.0*boyNum/1000000));




    }
}
