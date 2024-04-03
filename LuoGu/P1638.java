import java.util.Scanner;

public class P1638 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 1];
        int[] nums = new int[m + 1];
        for(int i = 1; i<=n; i++) a[i] = sc.nextInt();
        int L = 1,R = 0;
        int i = 1;
        int num = 0;
        while(num != m){
            if(nums[a[i]] == 0) num++;
            nums[a[i]] ++;
            R++;
            i++;
        }
        while(nums[a[L]] > 1){
            nums[a[L]] --; L ++;
        }
        int ansL = L; int ansR = R;
        while(i <= n){
            nums[a[i]] ++;
            R ++;
            i ++;
            while(nums[a[L]] > 1){
                nums[a[L]] --;
                L ++;
            }
            if(R - L < ansR - ansL) {
                ansR = R; ansL = L;
            }

        }
        System.out.println(ansL + " " + ansR);
        sc.close();
    }
}
