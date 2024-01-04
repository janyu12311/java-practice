package com.yuanshen.LambdAa;

import java.util.Scanner;

public class Demo5 {
    static int N;
//    public static int Fubo(int n,int[] arr){
//
//
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 1;
//        }
//        if (arr[n] == 0) {
//            arr[n]=Fubo(n-1,arr)+Fubo(n-2,arr);
//            return arr[n];
//        }else{
//            return arr[n];
//        }
//    }

public static int Fubo(int n,int[] arr){


    if(n==1){
        return 1;
    }
    if(n==2){
        return 1;
    }
   return Fubo(n-1,arr)+Fubo(n-2,arr);
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        int[] arr=new int[N+1];
        long start= System.currentTimeMillis();
        int fubo = Fubo(N,arr);
        long end= System.currentTimeMillis();
        System.out.println(fubo);

        System.out.println(end-start);
    }
}
