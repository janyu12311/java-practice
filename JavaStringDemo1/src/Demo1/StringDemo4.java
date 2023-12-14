package Demo1;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String rightUsername="13318739936";
        String rightPassword="yuanshenqidong";
        Scanner sc=new Scanner(System.in);
        int i=0;
        for(i=2;i>=0;i--){
            System.out.println("请输入账号");
            String Username=sc.next();
            System.out.println("请输入密码");
            String Password=sc.next();
            if(i!=0){
                if(rightPassword.equals(Password)&&rightUsername.equals(Username)){
                    System.out.println("登陆成功！");
                    return;
                }
                else{
                    System.out.println("输入错误，你还有"+i+"次机会");
                }
            }
            else{
                System.out.println("你完蛋了");
            }
        }

    }
}
