import java.math.BigInteger;
import java.util.Scanner;

public class P1226模板快速幂 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long p = sc.nextLong();
        long aTmp = a;
        long bTmp = b;
        long ans = 1;
        while(b > 0){
            if((b & 1) == 1){
                ans *= a;
                ans %= p;
            }
            a *= a;
            a %= p;
            b >>>= 1;
        }
        ans %= p;
        System.out.print(""+aTmp+"^"+bTmp+" mod "+p+"="+ans+"");
    }
}
