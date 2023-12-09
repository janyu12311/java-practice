package MethodPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入飞机票的原价");
        double Price=sc.nextDouble();
        System.out.println("请输入购买的月份");
        int month=sc.nextInt();
        System.out.println("请输入是购买头等舱还是经济舱");
        String Cabin=sc.nextLine();
        if(Cabin.equals("头等舱")){
            if(month>=5&&month<=10){
                 Price*=0.9;
            }
            else{
                Price*=0.7;
            }
        }
        else{
            if(month>=5&&month<=10){
                Price*=0.85;
            }
            else{
                Price*=0.65;
            }
        }
        System.out.println("价格是"+Price);
    }
}
