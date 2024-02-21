import java.math.BigInteger;
import java.util.Scanner;

public class 蓝桥杯2023A阶乘的和 {
    public static void main(String[] args) {
        int[] a = new int[100001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxv = Integer.MAX_VALUE;
        int mI = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < maxv) {
                mI = 1;
                maxv = a[i];
            } else if (a[i] == maxv)
                mI++;
        }
        while (mI % (maxv + 1) == 0) {
            mI = mI / (maxv + 1);
            maxv++;
            for (int i = 0; i < n; i++) {
                if (a[i] == maxv)
                    mI++;
            }
        }
        System.out.println(maxv);
    }
}