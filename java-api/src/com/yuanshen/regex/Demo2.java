package com.yuanshen.regex;

public class Demo2 {
    public static void main(String[] args) {
        String regex1="\\w{4,16}";
        String regex2="[1-9]\\d{16}([0-9]|[Xx])";
        System.out.println("44444444444444444X".matches(regex2));
        String regex3="(?i)abc";
        System.out.println("Abc".matches(regex3));
        System.out.println("ABC".matches(regex3));


        String regex5="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("44444444444444444X".matches(regex5));

        String regex4="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}
