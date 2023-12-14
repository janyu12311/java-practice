package Demo2;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String number=sc.next();
        String str="";
        for(int i=0;i<11;i++){
            if(i<=2||i>=7){
                System.out.print(number.charAt(i));
            }
            else{
                System.out.print("*");
            }
        }

    }
}
