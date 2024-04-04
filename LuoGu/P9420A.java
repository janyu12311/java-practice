public class P9420A {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i<=2023; i++){
            sb.append(String.valueOf(i));
        }
        char[] crs = sb.toString().toCharArray();
        long[] dp = new long[5];
        int len = crs.length;
        for(int i = 0; i<len; i++){
            if(crs[i] == '2'){
                dp[0] ++; dp[2] = dp[1] + dp[2];  
            }else if(crs[i] == '0'){
                dp[1] = dp[1] + dp[0];
            }else if(crs[i] == '3'){
                dp[3] = dp[2] + dp[3];
            }
        }
        System.out.println(dp[3]);
    }
}
