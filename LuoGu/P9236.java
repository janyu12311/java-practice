import java.util.Scanner;

public class P9236 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        long[] arr = new long[n+1];
        long[] pre = new long[n+1];
        long[][] wis = new long[21][2];
        for(int i = 1; i<=n; i++){
            arr[i] = sc.nextLong();
        }
        for(int i = 1; i<=n; i++){
            pre[i] = pre[i-1] ^ arr[i];
        }
        for(int i = 0; i<=n; i++){
            for(int j = 20; j>=0; j--){
                wis[j][(int) ((pre[i] >> j) & 1)] ++;
            }
        }
        long ans = 0;
        for(int i = 0; i<=20; i++){
            ans += wis[i][0] * wis[i][1] * (1 << i);
        }
        System.out.println(ans);
    }
}
