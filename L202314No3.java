package javaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
public class L202314No3 {
    static StreamTokenizer st;
    static BigInteger sb = new BigInteger("1000000007");
    public static void main(String[] args) throws IOException {
        st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int l = (int)st.nval;
        while(l>0){
            solve();
            l--;
        }
    }
    public static void solve() throws IOException{
        st.nextToken();
        int n = (int)st.nval;
        int tmp = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i<n; i++){
            st.nextToken();
            tmp = (int) st.nval;
            if(tmp % 2==0){
                a++;
            }else{
                b++;
            }
        }
        if(b % 2 !=0){
            System.out.println(0);
            return ;
        }
        a = b == 0?a:a+b-1;
        BigInteger dp = new BigInteger(String.valueOf(1));
        BigInteger ans = new BigInteger(String.valueOf(2));
        for(long i = 1,j = a; i< a ;i++,j--){
            BigInteger n1 = new BigInteger(String.valueOf(j));
            BigInteger n2 = new BigInteger(String.valueOf(i));
            dp = dp.multiply(n1).divide(n2);
            ans = ans.add(dp);
            ans = ans.mod(sb);
        }
        System.out.println(ans.mod(sb));
    }
}