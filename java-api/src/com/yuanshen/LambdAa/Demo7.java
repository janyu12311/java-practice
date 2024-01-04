package com.yuanshen.LambdAa;

public class Demo7 {

    public static int upStair(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return upStair(n-1)+upStair(n-2)+upStair(n-3);
    }
    public static void main(String[] args) {
        System.out.println(upStair(20));

    }
}
