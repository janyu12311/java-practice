import java.util.Scanner;

public class P2871 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int M = sc.nextInt();
        long[] dp = new long[M + 1];
        for(int i = 1; i <= n; i++){
            int w = sc.nextInt(); int d = sc.nextInt();
            for(int j = M; j >= w; j--){
                dp[j] = Math.max(dp[j] , dp[j - w] + d);
            }
        }
        System.out.println(dp[M]);
        sc.close();
    }
}
