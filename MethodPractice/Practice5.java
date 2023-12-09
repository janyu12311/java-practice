package MethodPractice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        int max=-1;
        int min=100;
        System.out.println("请输入六名评委的分数");
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int score=sc.nextInt();
            max=max>score?max:score;
            min=min<score?min:score;
            sum+=score;
        }
        System.out.println("最后得分为"+((sum-max-min)/4.0));
    }
}
