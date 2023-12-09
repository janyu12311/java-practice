package MethodPractice;

import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i]=(char)(97+i);
            }
            else{
                chs[i]=(char)(65+i-26);
            }
        }
        Random random=new Random();
        String result="";
        for (int i = 0; i < 4; i++) {
            int number=random.nextInt(chs.length);
//            System.out.println(chs[number]);
            result=result+chs[number];
        }
        System.out.println(result);


    }
}
