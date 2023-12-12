package Text5;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        String brand;
        int price=0;
        String color;
        Scanner sr=new Scanner(System.in);
        System.out.println("请输入品牌");
        brand=sr.next();
        System.out.println("请输入价格");
        price=sr.nextInt();
        System.out.println("请输入颜色");
        color=sr.next();
        Car car=new Car(brand,price,color);
        System.out.println("品牌："+car.getBrand()+
                "价格："+car.getPrice()+"颜色："+car.getCold());

    }
}
