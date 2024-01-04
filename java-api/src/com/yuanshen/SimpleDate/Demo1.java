package com.yuanshen.SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        String s="2020-11-11";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date s1=simpleDateFormat.parse(s);
        SimpleDateFormat s2=new SimpleDateFormat("yyyy年MM月dd");
        String result = s2.format(s1);
        System.out.println(result);
    }
}
