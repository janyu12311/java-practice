package com.yuanshen.GetNameRandom;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Java\\JavaIDEA\\JavaMyIoPractice1\\a.txt")));
        ArrayList<Student> list=new ArrayList<>();
        String s;
        double sum=0;
        while(( s = br.readLine()) != null){
            String[] strAll = s.split("-");
            double tmp=Double.parseDouble(strAll[3]);
            sum+=tmp;
            list.add(new Student(strAll[0],strAll[1],Integer.parseInt(strAll[2]),tmp));
        }
        br.close();
        double[] we=new double[list.size()];
        int index=0;
        for (Student student : list) {
            we[index++]=student.getWeight()/sum;
        }
        for(int i=1;i<we.length;i++){
            we[i]=we[i]+we[i-1];
        }

        double random=Math.random();
        int tmp=Arrays.binarySearch(we,random);
        int index2=-tmp-1;
        Student stu1 = list.get(index2);
        System.out.println(stu1);
        stu1.setWeight(stu1.getWeight()/2.0);
        list.set(index2,stu1);
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Java\\JavaIDEA\\JavaMyIoPractice1\\a.txt"));
        for (Student stu : list) {
            bw.write(stu.toString());
            bw.newLine();
        }
        bw.close();


    }
}
