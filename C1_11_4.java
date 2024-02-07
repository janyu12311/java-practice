
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1_11_4 {
    static int n;
    static int num;
    static int[] lens;
    static int out = 0;

    public static boolean ifOK(int x) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += lens[i] / x;
        }
        if (sum >= num) {
            out = x;
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        num = Integer.parseInt(str.split(" ")[1]);
        lens = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            double tmp = Double.parseDouble(br.readLine());
            lens[i] = (int) (tmp * 100);
            max = Math.max(max, lens[i]);
        }
        int left = 1;
        int right = max;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (ifOK(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(out == 0){
            System.out.println("0.00");
        }else{
            System.out.printf("%.2f",(double)out/100);
        }

    }
}
