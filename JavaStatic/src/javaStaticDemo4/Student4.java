package javaStaticDemo4;

public class Student4 {
    private String name;
    private int age;
    private static String teacherName;

    public Student4() {
    }

    public Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student4.teacherName = teacherName;
    }

    public void show(){
        System.out.println(name+","+age+","+teacherName);
    }


    public static void method(){
        System.out.println("我是静态方法");
    }



}
