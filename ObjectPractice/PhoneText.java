package ObjectPractice;

public class PhoneText {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米手机";
        p.Price=1999.9;
        System.out.println(p.brand);
        System.out.println(p.Price);
        p.call();
        p.PlayGame();
    }
}
