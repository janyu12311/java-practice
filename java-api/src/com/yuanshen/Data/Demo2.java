package com.yuanshen.Data;

import java.util.Date;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
//        Date date=new Date(0L);
//        long time=date.getTime();
//        time+=1000L*60*60*24*365;
//        date.setTime(time);
//
//        System.out.println(date);
        Random r=new Random();
        Date d1=new Date(Math.abs(r.nextInt()));
        Date d2=new Date(Math.abs(r.nextInt()));

        System.out.println(d1);
        System.out.println(d2);

        long time1=d1.getTime();
        long time2=d2.getTime();

        if(time1>time2){
            System.out.println("第一个时间在后");
        }else if (time1<time2){
            System.out.println("第二个时间在后");
        }else{
            System.out.println("两个时间相等");
        }

    }
}
