package com.yuanshen.LambdAa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
/*        String s1="abc";
        String s2="abc";
        int i = s1.compareTo(s2);
        System.out.println(i);*/
        girlFriend[] arr=new girlFriend[3];
        ArrayList<girlFriend> list=new ArrayList<>();
        arr[0]=new girlFriend(18,"Elysia",173);
        arr[1]=new girlFriend(32,"ZhangSan",180);
        arr[2]=new girlFriend(18,"xiaoMing",163);
        Arrays.sort(arr, (o1, o2)->{
                if(o1.age==o2.age){
                    if(o1.height==o2.height){

                        if(o1.name.compareTo(o2.name)==0){
                            return 0;
                        }
                        return o1.name.compareTo((o2.name));
                    }
                    return o1.height-o2.height;
                }
                return o1.age-o2.age;
            }
        );
/*        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name+","+arr[i].age+","+arr[i].height);
        }*/
        System.out.println(Arrays.toString(arr));


    }
}
class girlFriend{
    public int age;
    public String name;
    public int height;

    public girlFriend() {
    }

    public girlFriend(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return (name+" "+age+" "+height);
    }
}
