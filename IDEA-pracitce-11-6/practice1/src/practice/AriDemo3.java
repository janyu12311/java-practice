package practice;

import java.util.Scanner;

public class AriDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num=sc.nextInt();
        System.out.println("三位数的个位是："+num%10);
        System.out.println("三位数的十位是："+num/10%10);
        System.out.println("三位数的百位是："+num/100);
    }
}
