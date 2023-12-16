package List.Demo7;

import java.util.ArrayList;
import java.util.Scanner;

public class UserText {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入id");
            String id=sc.next();
            System.out.println("请输入用户名");
            String username= sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            list.add(new User(id,username,password));
        }
        System.out.println("请输入要查找的id");
        String check=sc.next();
        int tmp=check(list,check);
        while (true) {
            if(tmp==-1){
                System.out.println("查无此人，请重新输入");
            }
            else {
                System.out.println(list.get(tmp).getId()+" "+list.get(tmp).getUsername()
                +" "+list.get(tmp).getPassword());
                break;
            }
        }

    }
    public static int check(ArrayList<User> list,String check){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(check)){
                return i;
            }
        }
        return -1;
    }
}
