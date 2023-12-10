package Gril;

public class Gril {
    private String name;
    private String gander;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getGander() {
        return gander;
    }

    public void eat() {
        System.out.println("正在吃饭中");

    }

    public void sleep() {
        System.out.println("正在睡觉");
    }
}
