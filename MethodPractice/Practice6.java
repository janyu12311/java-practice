package MethodPractice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip1=sc.nextInt();
        int tmp=ip1;
        int count=0;
        while(tmp!=0){
            tmp/=10;
            count++;
        }
        int[] arr=new int[count];
        for(int i=count-1,k=0;i>=0;i--,k++){
            tmp=ip1;
            for(int j=0;j<i;j++){
                tmp/=10;
            }
            arr[k]=tmp%10;
        }
        for (int i =0,k= arr.length-1; i<k; i++,k--) {
            tmp=arr[i];
            arr[i]=arr[k];
            arr[k]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]%=10;
        }
        int output=0;
        for (int i = 0; i < arr.length; i++) {
            output=output*10+arr[i];
        }
        System.out.println(output);
    }
}
