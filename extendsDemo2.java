public class extendsDemo2 {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.show1();
    }

}

class Fu{
    String name="你好";
}
class Zi extends Fu{
    private String name="李四";
    public void show1(){
        String name="王五";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
