package List.Demo6;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo6Scanner {
    public static void main(String[] args) {
        ArrayList<Demo6> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生的姓名");
            String name=sc.next();
            System.out.println("请输入学生的学号");
            int age=sc.nextInt();
            list.add(new Demo6(name,age));
        }
        //遍历
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1) {
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge() + "]");

            }else{
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge()+",");
            }
        }
    }


}

