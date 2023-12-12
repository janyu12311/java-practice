package Gril;

public class GrilText {
    public static void main(String[] args) {
        Gril gr1=new Gril();
        gr1.setName("刻晴");
        gr1.setAge(18);
        gr1.setGander("萌妹子");
        System.out.println(gr1.getAge());
        System.out.println(gr1.getName());
        System.out.println(gr1.getGander());
        gr1.eat();
        System.out.println("---------------------");
        Gril gr2=new Gril();
        gr2.setName("芙芙");
        gr2.setAge(18);
        gr2.setGander("萌妹子");
        System.out.println(gr2.getAge());
        System.out.println(gr2.getName());
        System.out.println(gr2.getGander());
        gr2.sleep();
    }
}
