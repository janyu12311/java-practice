import java.math.BigInteger;
import java.util.Scanner;

public class C_1_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String tmpStr = sc.nextLine();
        int F1 = Integer.parseInt(tmpStr.split(" ")[0]);
        String numStr = tmpStr.split(" ")[1];
        int F2 = Integer.parseInt(tmpStr.split(" ")[2]);
        BigInteger br = new BigInteger(numStr,F1);
        System.out.println(br.toString(F2).toUpperCase());
    }
}