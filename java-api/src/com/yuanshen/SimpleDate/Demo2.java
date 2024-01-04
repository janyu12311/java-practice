package com.yuanshen.SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //空参

//        Method1();
        String str="2023-11-11 11:11:11";
        SimpleDateFormat s=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date parse = s.parse(str);
        System.out.println(parse);

    }

    private static void Method1() {
        SimpleDateFormat s = new SimpleDateFormat();
        String format = s.format(new Date());
        System.out.println(format);
        //带参构造
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月 E HH:mm:ss");
        System.out.println(s2.format(new Date()));
    }
}
