package cmo.yuanshen.regexPa;

public class Demo3 {
    public static void main(String[] args) {

        String s="张三fsafsadf453李四sfasdfsfs4464王五";
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);

    }
}
