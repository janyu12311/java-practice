package Simple;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static final int ADD_STUDENT=1;
    public static final int DELETE_STUDENT=2;
    public static final int QUERY_STUDENT=3;
    public static final int MODIFY_STUDENT=4;
    public static final int EXIT=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            menu();
            System.out.println("请输入你的选择");
            int choice = sc.nextInt();
            switch (choice) {
                case EXIT: {
                    System.out.println("拜拜");
                    break loop;
                }
                case ADD_STUDENT: {
                    add(list);
                    System.out.println("添加成功");
                    break;
                }
                case DELETE_STUDENT: {
                    declare(list);
                    break;

                }
                case QUERY_STUDENT:{
                    queryStudent(list);
                    break;
                }
                case MODIFY_STUDENT:{
                    modify(list);
                    break;
                }

            }
        }


    }

    public static void declare(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的ID");
        String id = sc.next();
        int tmp=getIndex(list,id);
        if(tmp>=0){
            list.remove(tmp);
            System.out.println("id为"+id+"的学生删除成功");
        }
        else{
            System.out.println("查无此人，删除失败");
        }

    }

    //增加
    public static void add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        int age;
        String home;
        System.out.println("请输入ID");
        id = sc.next();
        boolean b = contains(list, id);
        if(b){
            System.out.println("id重复，请重新输入");
            return;
        }
        System.out.println("请输入名字");
        name = sc.next();
        System.out.println("请输入年龄");
        age = sc.nextInt();
        System.out.println("请输入家庭住址");
        home = sc.next();
        list.add(new Student(id, name, age, home));

    }
    //修改
    public static void modify(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的ID");
        String id=sc.next();
        int tmp=getIndex(list,id);
        if(tmp>=0){
            String name;
            int age;
            String home;
            System.out.println("请输入名字");
            name = sc.next();
            System.out.println("请输入年龄");
            age = sc.nextInt();
            System.out.println("请输入家庭住址");
            home = sc.next();
            list.set(tmp,new Student(id, name, age, home));
            System.out.println("修改成功");
        }
        else{
            System.out.println("查无此人，修改失败");
        }
    }

    public static void menu() {
        System.out.println("------------------------------------------");
        System.out.println("--------欢迎来到剑彧的学生管理系统----------");
        System.out.println("--------1.增加学生     2.删除学生 ---------");
        System.out.println("--------3.显示学生     4.修改学生----------");
        System.out.println("---------------- 0.退出 ------------------");
        System.out.println("------------------------------------------");
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("暂无数据，请输入数据后再打印");
            return;
        }
        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(
                    list.get(i).getId() + "\t" +
                            list.get(i).getName() + "\t" +
                            list.get(i).getAge() + "\t" +
                            list.get(i).getHome()
            );
        }
    }

    public static boolean contains(ArrayList<Student> list,String id){
        if(list.size()==0){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
  //寻找索引
    public static int getIndex(ArrayList<Student> list,String id){
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
