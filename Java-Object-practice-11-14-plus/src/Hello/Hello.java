package Hello;

public class Hello {
    private String name;
    private int age;
    private double HeHao;

    public Hello(String name, int age, double heHao) {
        this.name = name;
        this.age = age;
        HeHao = heHao;
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

    public double getHeHao() {
        return HeHao;
    }

    public void setHeHao(double heHao) {
        HeHao = heHao;
    }
}
