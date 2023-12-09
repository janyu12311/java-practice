package Method;

public class Demo4 {
    public static double Cal1(double x,double y){
        return x*y;
    }
    public static void main(String[] args) {
        double zhe1=Cal1(3.4,5.1);
        double zhe2=Cal1(4.2,6.5);
        if(zhe1>zhe2){
            System.out.println("zhe1 win!");
        }
        else if(zhe1<zhe2){
            System.out.println("zhe2 win");
        }
        else {
            System.out.println("same");
        }
    }
}
