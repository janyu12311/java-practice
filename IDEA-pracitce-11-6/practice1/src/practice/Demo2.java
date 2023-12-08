package practice;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入第一只老虎的体重");
        Scanner sc=new Scanner(System.in);
        int tiger1=sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int tiger2=sc.nextInt();
        int maxt= tiger1>tiger2?tiger1 :tiger2;
        System.out.println("最大老虎的体重为：");
    }
}
