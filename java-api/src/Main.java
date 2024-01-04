import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        BigInteger b=BigInteger.valueOf(0);
        for (int j = 1; j <= n; j++) {
            BigInteger b2=BigInteger.valueOf(1);
            for (int i = 1; i <=j; i++) {
                BigInteger tmp=BigInteger.valueOf(i);
                b2=b2.multiply(tmp);
            }
            b=b.add(b2);
        }
        System.out.println(b);
    }
}