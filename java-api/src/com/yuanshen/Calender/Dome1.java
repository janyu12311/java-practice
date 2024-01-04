package com.yuanshen.Calender;

import java.util.Calendar;
import java.util.Date;

public class Dome1 {
    public static void main(String[] args) {
        Calendar c1= Calendar.getInstance();

        Date d=new Date(0L);
        c1.setTime(d);
        System.out.println(c1);
        c1.set(Calendar.YEAR,2000);
        c1.set(Calendar.MONDAY,12);
        c1.add(Calendar.MONDAY,2);
        c1.add(Calendar.MONDAY,-1);
        int year = c1.get(1);
        int month = c1.get(2);
        int day = c1.get(5);
        int week=c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+","+(month+1)+","+day+" "+week);
    }
}
