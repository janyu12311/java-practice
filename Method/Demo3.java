package Method;

public class Demo3 {
    public static void Cal2(double x){
        double result=3.1415926*x*x;
        System.out.println(result);
    }
    public static void Cal(double x,double y){
        double result=(x+y)*2;
        System.out.println(result);

    }
    public static void main(String[] args) {
        Cal(5.2,4.9);
        Cal2(6.2);
    }
}
