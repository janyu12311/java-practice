
public class oppDemo3 {
    public static void main(String[] args) {
        Person p1=new Person("老王",30);
        Person p2=new Person("老李",25);
        Dog d=new Dog("2岁的狗","黑");
        Cat c=new Cat("3岁的猫","灰颜色");
        d.lookHome();
        d.eat("骨头");
        p1.keepPet(d,"骨头");
        c.eat("鱼骨头");
        p2.keepPet(c,"鱼骨头");


    }
}

class Animals{
    public String name;
    public String color;

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat(String name){
        System.out.println(this.color+this.name+"吃了"+name);
    }
}
class Dog extends Animals{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String name) {
        System.out.println(this.name+this.color+"抱着"+name+"嘎嘎吃");
    }

    public void lookHome(){
        System.out.println(this.color+this.name+"在看家");
    }
}
class Cat extends Animals{

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String name) {
        System.out.println(this.color+this.name+"抱着"+name+"嘎嘎吃");
    }

    public void catMouse(){
        System.out.println(this.color+this.name+"在抓老鼠");
    }

}
class Person{
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animals p, String something){
        if(p instanceof Dog){
            System.out.println(this.age+this.name+"喂狗用"+something);
        }else if(p instanceof Cat){
            System.out.println(this.age+this.name+"喂猫用"+something);
        }
    }

}