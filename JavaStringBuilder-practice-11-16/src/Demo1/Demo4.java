package Demo1;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        String result=new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("是回文数");
        }
        else{
            System.out.println("不是回文数");
        }

    }
}
