package MethodPractice;

import java.util.Random;

public class Practice7 {
    public static void main(String[] args) {
        int[] arr1={2,588,888,1000,10000};
        Random random=new Random();
        for (int i = 0; i < arr1.length;) {
            int index=random.nextInt(5);
            if(arr1[index]!=0){
                System.out.println("抽到的奖金为"+arr1[index]);
                arr1[index]=0;
                i++;
            }
        }
    }
}
