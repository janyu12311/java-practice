package com.yuanshen.GetNameRandom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\桌面\\手术室\\姓名.txt"));
        ArrayList<String> list=new ArrayList<>();
        String s;
        while((s = br.readLine()) != null){
            list.add(s);
        }
        Random r=new Random();
        System.out.print(list.get(r.nextInt(list.size())  ).split("-")[0]     );

    }
}
