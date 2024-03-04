import java.util.Scanner;
class Person{
    int win;
    int lose,used;
    public Person(int lose,int win,int used){
        this.lose = lose;
        this.win = win;
        this.used = used;
    }
}
public class P1802 {
    static int n;
    static Person[] ps;
    static long[][] dp;
    public static long f(int i , int x){
        if(i > n) return 0;
        long max = 0;
        if(dp[i][x] != 0) return dp[i][x];
        if(x >= ps[i].used){
            max = f(i + 1, x - ps[i].used) + ps[i].win;
        }
        max = Math.max(max,f(i + 1, x) + ps[i].lose);
        dp[i][x] = max;
        return dp[i][x];
    }
    public static long f(int i , int sum , int x){
        if(i > n) return sum;
        long max = 0;
        if(dp[i][x] != 0) return dp[i][x];
        if(x >= ps[i].used){
            max = f(i + 1, sum + ps[i].win, x - ps[i].used);
        }
        max = Math.max(max,f(i + 1, sum + ps[i].lose , x));
        dp[i][x] = max;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = sc.nextInt();
        ps = new Person[n + 1];
        dp = new long[n+1][x+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=x; j++){
                dp[i][j] = 0;
            }
        }
        for(int i = 1; i<=n; i++){
            ps[i] = new Person(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println(f(1, x) * 5);
    }
}