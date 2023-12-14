package StringJoinerDemo1;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int len=arr[arr.length-1].length();
        System.out.println(len);
    }
}
