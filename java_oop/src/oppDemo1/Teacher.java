package oppDemo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师的信息为:"+getName()+","+getAge());
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
