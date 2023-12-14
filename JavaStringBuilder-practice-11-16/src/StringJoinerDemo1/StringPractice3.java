package StringJoinerDemo1;

import java.util.Random;
import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char[] charArray = str.toCharArray();
        String result=missArr(charArray);
        System.out.println(result);



    }
    //打乱字符数组里的值并返回一个string
    public static String missArr(char[] arr){
        Random r=new Random();
        char[] newArr=new char[arr.length];
        int i=0;
        for(i=0;i<arr.length;){
            int tmp=r.nextInt(arr.length);
            if(arr[tmp]!='*'){
                newArr[i]=arr[tmp];
                arr[tmp]='*';
                i++;
            }
        }
        String result=new String(newArr);
        return result;
    }
}
