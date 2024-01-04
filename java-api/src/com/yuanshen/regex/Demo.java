package com.yuanshen.regex;

public class Demo {
    public static void main(String[] args) {
        String regex1="[1][3-9]\\d{9}";
        System.out.println("13318739936".matches(regex1));
        System.out.println("-------------------------------");
        String regex2="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("-------------------------------");
        String regex4="(1[0-2]|0?[1-9]):[0-5]\\d:[0-5]\\d";
        String regex5="([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex5));

    }
}
