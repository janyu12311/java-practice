package javaStaticDemo3;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",18,"男"));
        list.add(new Student("李四",15,"男"));
        list.add(new Student("王五",45,"男"));
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
