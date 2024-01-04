package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
//        BigInteger bigInteger=new BigInteger(133132,new Random());
//        System.out.println(bigInteger);

        //获得大整数
        BigInteger bigInteger=new BigInteger("123");
        System.out.println(bigInteger);
        BigInteger bigInteger1=new BigInteger("132");
        System.out.println(bigInteger.add(bigInteger1));
        BigInteger b2=BigInteger.valueOf(10);
        BigInteger b3=BigInteger.valueOf(3);
        BigInteger[] arr=b2.divideAndRemainder(b3);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        BigInteger b4=b2.pow(3);
        System.out.println(b4);



    }
}
