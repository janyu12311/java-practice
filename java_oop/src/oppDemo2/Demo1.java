package oppDemo2;

public class Demo1 {
    public static void main(String[] args) {
        Animals a=new Cat();
//        a.eat();
//        Dog b=(Dog)a;
//        b.lookHome();
        if(a instanceof Dog){
            Dog c=(Dog)a;
            c.lookHome();
        }else if(a instanceof Cat){
            Cat c=(Cat)a;
            c.eat();
        }


    }
}
class Animals{
    public void eat(){
        System.out.println("动物在吃饭");
    }
}

class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animals{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}