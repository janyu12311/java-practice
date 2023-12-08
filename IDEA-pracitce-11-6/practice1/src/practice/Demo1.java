package practice;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();;
        int b=sc.nextInt();;
        boolean ret=a==6||b==6||(a+b)==6;
        System.out.println(ret);

    }

}
