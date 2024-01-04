package Ojbect;

import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {

        Object o=new Student("张三",23);
        String str = o.toString();
        System.out.println(str);

    }
}
