package com.yuanshen.LambdAa;

public class Demo6 {
    public static int Digui(int n){
        if(n==10){
            return 1;
        }
        return (Digui(n+1)+1)*2;
    }
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 9; i++) {
            count+=1;
            count*=2;
        }
        int digui = Digui(1);
        System.out.println(digui);
        System.out.println(count);
    }
}
