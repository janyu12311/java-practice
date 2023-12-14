package StringJoinerDemo1;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            String str=sc.next();
            if(checkStr(str)){
                String result=numberToMath(str);
                System.out.println(result);
                break;
            }
            else{
                System.out.println("输入有误，请重新输入");
            }
        }


    }
    public static String numberToMath(String arr){
        String[] math={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            int len = arr.charAt(i)-'0';
           sb.append(math[len]+" ");
        }
       return sb.toString();
    }
    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
}
