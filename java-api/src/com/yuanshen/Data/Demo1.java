package com.yuanshen.Data;

import javax.xml.crypto.Data;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        Date d2=new Date(0L);
        System.out.println(d2);

        //set修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //获取时间
        long l= d2.getTime();
        System.out.println(l);


    }
}
