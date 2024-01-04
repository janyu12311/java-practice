package com.yuanshen.LambdAa;

public class Lamb {
    public static void main(String[] args) {
        Method(()->{
            System.out.println("游泳~~~");
        });

    }
    public static void Method(Swim s){
        s.Swim();
}



}
interface Swim{
    public abstract void Swim();
}