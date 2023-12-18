package extendDemo3;

public class Student{
    private String name;
    private int age;
    private String school;
    public Student(){
        this(null,0,"哔哩哔哩大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
