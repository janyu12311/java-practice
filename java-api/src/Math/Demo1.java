package Math;

public class Demo1 {
    public static void main(String[] args) {

//        System.out.println(Math.absExact(-2147483648));
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.5));
        System.out.println(Math.max(20,30));
        System.out.println(Math.pow(2,-2));
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random()*100));
        }
    }
}
