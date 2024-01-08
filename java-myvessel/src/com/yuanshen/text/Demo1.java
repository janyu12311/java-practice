package com.yuanshen.text;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder();
        str1.append(1534236469);
        StringBuilder str2=str1.reverse();
        String tmp=str2.toString();
        Integer n2=Integer.valueOf(tmp);
        System.out.println(n2);
    }
}
