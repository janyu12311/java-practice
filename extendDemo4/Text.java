package extendDemo4;

public class Text {
    public static void main(String[] args) {
        manager m=new manager("1312","何昊",13245,12443);
        cook c=new cook("123456","邓子龙",12346);
        m.work();
        m.eat();
        c.work();
        c.eat();
    }
}
