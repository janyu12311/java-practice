package Demo2;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=0;
        while (true) {
            money= sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }
            else{
                System.out.println("金额无效");
            }
        }
        int tmp=money;
        String str="";

        while(tmp!=0){
            int num=tmp%10;
            str=getCapitalNumber(num)+str;
            tmp/=10;

        }
        int count=7-str.length();
        for (int i = count; i > 0; i--) {
            str="零"+str;
        }

    }
    public static String getCapitalNumber(int money){
        String[] arr={"零","一","二","三","四","五","六","七","八","九"};
        return arr[money];
    }
}
