package com.yuanshen.SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String start="2020年11月11日 0:0:0";
        String end="2020年11月11日 0:10:0";
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start1 = s1.parse(start);
        Date start2 = s1.parse(end);
        long startTime=start1.getTime();
        long endTime=start2.getTime();
        String people="2020年11月11日 0:11:0";
        Date pe=s1.parse(people);
        long pt=pe.getTime();
        if(startTime<=pt&&pt<=endTime){
            System.out.println("抢到了");
        }else{
            System.out.println("没抢到");
        }
    }
}
