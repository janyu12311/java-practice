import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1314 {
    static int[] l, n, w, v;
    static long[] pre_n, pre_v;
    static long s;
    static long sum;
    static int N, M;
    static long Y;

    public static boolean ifOK(int x) {
        Y = 0;
        sum = 0;
        pre_n = new long[N + 1];
        pre_v = new long[N + 1];
        pre_n[0] = 0;
        pre_v[0] = 0;
        for (int i = 1; i <= N; i++) {
            if (w[i] >= x) {
                pre_n[i] = pre_n[i - 1] + 1;
                pre_v[i] = pre_v[i - 1] + v[i];
            } else {
                pre_n[i] = pre_n[i - 1];
                pre_v[i] = pre_v[i - 1];
            }
        }
        for (int i = 1; i <= M; i++) {
            Y += (pre_n[n[i]] - pre_n[l[i] - 1]) * (pre_v[n[i]] - pre_v[l[i] - 1]);
        }
        sum = Math.abs(Y - s);
        if (Y - s > 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        N = Integer.parseInt(tmp.split(" ")[0]);
        M = Integer.parseInt(tmp.split(" ")[1]);
        s = Long.parseLong(tmp.split(" ")[2]);
        l = new int[N + 1];
        n = new int[N + 1];
        w = new int[N + 1];
        v = new int[N + 1];

        int minW = Integer.MAX_VALUE;
        int maxW = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            tmp = br.readLine();
            w[i] = Integer.parseInt(tmp.split(" ")[0]);
            minW = Math.min(maxW, w[i]);
            maxW = Math.max(maxW, w[i]);
            v[i] = Integer.parseInt(tmp.split(" ")[1]);
        }
        for (int i = 1; i <= M; i++) {
            tmp = br.readLine();
            l[i] = Integer.parseInt(tmp.split(" ")[0]);
            n[i] = Integer.parseInt(tmp.split(" ")[1]);
        }
        long ans = Long.MAX_VALUE;
        int left = minW;
        int right = maxW;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (ifOK(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (sum < ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}