package com.yuanshen.LoginPractice;

import java.io.*;

public class LoginPractice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\Java\\JavaIDEA\\JavaMyIoPractice1\\login.txt"));
        String s=br.readLine();
        String[] strAll = s.split("&");
        String[] name=strAll[0].split("=");
        String[] password=strAll[1].split("=");
        String realName=name[1];
        String realPassword=password[1];
        br.close();;
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入账号");
        String InputName=br2.readLine();
        System.out.println("请输入密码");
        String InputPassword=br2.readLine();
        if(InputName.equals(realName)&&InputPassword.equals(realPassword)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
        br2.close();
    }
}
