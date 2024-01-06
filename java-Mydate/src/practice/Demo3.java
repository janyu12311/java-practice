package practice;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        StringBuilder sb1=new StringBuilder();
        if(str1.matches("[0-9]+")){
            Integer num=Integer.valueOf(str1);
            while(num!=0){
                sb1.append(num%2);
                num/=2;
            }
        }else{
            System.out.println("输入错误");
        }
        String str2=sb1.toString();
        for (int length = str2.length()-1; length >= 0; length--) {
            System.out.print(str2.charAt(length));
        }
    }
}
