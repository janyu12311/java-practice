package cmo.yuanshen.regexPa;

public class Demo5 {
    public static void main(String[] args) {
        String s="我要学编编编编编程程程程程程程程程程程程程";
        String s1 = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s1);
    }
}
