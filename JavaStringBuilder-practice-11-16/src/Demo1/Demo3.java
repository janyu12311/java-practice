package Demo1;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
//        int length = getArr().substring(1).replace("a", "b").length();
//        System.out.println(length);
        StringBuilder sb=new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
    }
    public static String getArr(){
        Scanner sr=new Scanner(System.in);
        String s=sr.next();
        return s;
    }
}
