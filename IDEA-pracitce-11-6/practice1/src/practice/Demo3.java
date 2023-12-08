package practice;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tiger1=sc.nextInt();
        int tiger2=sc.nextInt();
        String ret=tiger1==tiger2?"相同":"不相同";
        System.out.println(ret);
    }
}
