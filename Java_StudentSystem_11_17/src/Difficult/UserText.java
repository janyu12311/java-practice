package Difficult;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserText {
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("张三","1234que","411723222222222222","1111111111"));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建集合

        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    login(list);
                }
                case 2 -> {
                    //注册
                    register(list);
                    //                printList(list);
                }
                case 3 -> {
                    forgetPassword(list);
                    //忘记密码
                }
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("输入错误,请重新输入");
                }
            }
        }
    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("请输入要更改的用户名");
        Scanner sc=new Scanner(System.in);
        String Username=sc.next();
        int tmp=getIndex(list,Username);
        if(tmp==-1){
            System.out.println("未注册");
            return;
        }
        else{
            System.out.println("请输入身份证号");
            String identity;
            identity=sc.next();
            boolean flag=false;
            for (int i = 0; i < list.size(); i++) {
                list.get(i).getIdentity().equals(identity);
                flag=true;
                break;
            }
            if(flag){
                System.out.println("请输入要修改的密码");
                String passWord=sc.next();
                list.get(tmp).setPassword(passWord);
                System.out.println("密码修改成功");
            }

        }
    }

    //登陆
    private static void login(ArrayList<User> list) {
        int i=0;
        while (true) {
            System.out.print("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.print("请输入密码：");
            String passWord = sc.next();
            while (true) {
                String Code=getCode();
                System.out.println("请输入验证码"+"("+Code+")");
                String code=sc.next();
                if(!(code.equals(Code))){
                    System.out.println("验证码错误！请重新输入");
                }else{
                    break;
                }
            }
            //将零散的数据存在对象中
            User UserInfo=new User(name,passWord,null,null);
            boolean result=checkUserInfo(UserInfo,list);
            if (result) {
                System.out.println("登陆成功");
                return;
            } else {
                if(i==2){
                    System.out.println("账号被锁定，请联系剑彧并v50解锁账号");
                    return;
                }
                i++;
                System.out.println("密码或账号或验证码错误，登陆失败，请重试(还有"+(3-i)+"次机会)");
            }
        }

    }

    //注册功能
    public static void register(ArrayList<User> list) {
        //用户名阶段
        System.out.println("请输姓名");
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            name = sc.next();
            if (checkName(name)) {
                if (getIndex(list, name) != -1) {
                    System.out.println("输入的用户名已经被注册");
                } else {
                    break;
                }
            } else {
                System.out.println("输入的用户名有问题");
            }

        }
        //密码阶段
        String password1;
        String password2;
        while (true) {
            System.out.println("请输入密码");
            password1 = sc.next();
            System.out.println("确认密码");
            password2 = sc.next();
            if (password2.equals(password1)) {
                System.out.println("密码设置成功");
                break;
            } else {
                System.out.println("两次密码输入不同，请重新输入");
            }
        }
        //身份证
        String identity;
        while (true) {
            System.out.println("请输入身份证信息");
            identity = sc.next();
            if (checkIdentity(identity)) {
                System.out.println("身份证信息录入成功");
                break;
            } else {
                System.out.println("身份证信息有误,请重新输入");
            }
        }
        //手机号
        String number;
        while (true) {
            System.out.println("请输入手机号");
            number = sc.next();
            if (checkNumber(number)) {
                System.out.println("手机号录入成功");
                break;
            } else {
                System.out.println("手机号输入有误，请重新输入");
            }
        }
        list.add(new User(name, password1, identity, number));
        System.out.println("注册成功！");

    }

    //判断用户名是否符合条件
    public static boolean checkName(String name) {
        int count = 0;
        int len = name.length();
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= '0' && name.charAt(i) <= '9') &&
                    (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') &&
                    (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')) {
                return false;
            }
        }
        //判断用户名中有多少个数字
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= '0' && name.charAt(i) <= '9')) {
                count++;
            }
        }
        if (count == name.length()) {
            return false;
        }
        if (len < 3 || len > 15) {
            return false;
        }
        return true;

    }

    //判断身份证是否符合条件
    public static boolean checkIdentity(String identity) {
        if (identity.length() != 18) {
            return false;
        }
        if (identity.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < identity.length() - 1; i++) {
            if (!(identity.charAt(i) >= '0' && identity.charAt(i) <= '9')) {
                return false;
            }
        }
        if (!(identity.charAt(identity.length() - 1) >= '0' && identity.charAt(identity.length() - 1) <= '9') &&
                (identity.charAt(identity.length() - 1) == 'x') && (identity.charAt(identity.length() - 1) == 'X')) {
            return false;
        }
        return true;
    }

    //验证手机号是否符合条件
    public static boolean checkNumber(String number) {
        if (number.length() != 11) {
            return false;
        }
        if (number.charAt(0) == 0) {
            return false;
        }
        return true;
    }

    //查找索引
    public static int getIndex(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //打印list里的内容
    public static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " +
                    list.get(i).getPassword() + " " +
                    list.get(i).getIdentity() + " " +
                    list.get(i).getNumber());
        }
    }

    //打印菜单
    public static void menu() {
        System.out.println("----------欢迎来到学生管理系统-----------");
        System.out.println("请选择操作:1.登陆 2.注册 3.忘记密码 0.退出");
    }

    //获取验证码
    public static String getCode() {
        ArrayList<Character> listCharacter = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            listCharacter.add((char) ('a' + i));
        }
        for (int i = 0; i < 26; i++) {
            listCharacter.add((char) ('A' + i));
        }
        Random r = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int tmp = r.nextInt(listCharacter.size());
            result.append(listCharacter.get(tmp));
        }
        result.append(r.nextInt(10));
        char[] arr=result.toString().toCharArray();
        //最后一个和随机索引进行交换
        int randomIndex=r.nextInt(arr.length);
        char temp=arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return new String(arr);
    }
    //判断用户输入的密码是否正确

    public static boolean checkUserInfo(User userInfo,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(userInfo.getName()) &&
                    list.get(i).getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
