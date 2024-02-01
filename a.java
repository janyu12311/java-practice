package javaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class a {
   static long[][] dp;
   static StreamTokenizer st;
   static int n;
   static long allSum;

   public static void main(String[] args) throws IOException {
      st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
      st.nextToken();
      int l = (int) st.nval;
      while (l > 0) {
         solve();
         l--;
      }
   }
   public static void solve() throws IOException {
      st.nextToken();
      n = (int) st.nval;
      int[] a = new int[n];
      allSum = 0;
      for(int i = 0; i<n; i++){
         st.nextToken();
         a[i] = (int) st.nval;
         allSum += a[i];
      }
      dp = new long[n+1][Integer.MAX_VALUE];
      for(int i = 0; i<=n ; i++){
         for(int j =0; j<=allSum; j++){
            dp[i][j] = -1;
         }
      }
      System.out.println(f(0,0l,a));
   }
   public static long f(int i,Long sum,int[] a){
      if(i == n){
          if((allSum - sum)%2==0&&sum%2==0){
            return 1;
          }
          else{
            return 0;
          }
      }
      if(dp[i][sum.hashCode()] != -1){
          return dp[i][sum.hashCode()];
      }
      dp[i][sum.hashCode()] = (f(i+1,sum,a)%1000000007+f(i+1, sum+a[i], a)%1000000007)%1000000007;
      return dp[i][sum.hashCode()];
   }
}