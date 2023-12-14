package Demo1;

import java.util.Scanner;

public class Demo1 {
    String s1 = "最喜欢玩原神了";

    public static void main(java.lang.String[] args) {
//        java.lang.String s2=new java.lang.String();
////        System.out.println("@"+s2+"!");
//        java.lang.String s3 = new java.lang.String("abc");
//        char[] arr = {'a', 'b', 'c', 'd'};
//        java.lang.String s4 = new String(arr);
////        System.out.println(s3);
//        System.out.println(s4);
//        byte[] arr1 = {97, 98, 99, 100};
//        java.lang.String s5 = new String(arr1);
//        System.out.println(s5);
//        Scanner sr = new Scanner(System.in);
////        String name = sr.next();
//        String s2 = new String("现在我有东西了");
//        System.out.println("右边是s2>"+s2+"<左边是s2");
//        String s1=new String("abc");
//        String s2=new String("Abc");
//        boolean flag=s1.equalsIgnoreCase(s2);
//        System.out.println(flag);
        Scanner sc=new Scanner(System.in);
        //输入一个字符串
        String s1=sc.next();
        String s2="abc";
        //与原本存在的字符串进行比较
        System.out.println(s1==s2);

    }
}
