import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P9242 {
    public static int[] arr;
    public static int n;
    public static int f(int cur,int pre){
        if(cur >= n-1) return 0;
        if(pre % 10 !=  rFirst(arr[cur])){
            int mn = min(f(cur + 1,pre),f())
        }
    }
    public static int rFirst(int num){
        int tmp = num;
        int wei = 0;
        while(tmp != 0){
            tmp /= 10;
            wei ++;
        }
        return num / wei;
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n = (int) st.nval;
        for(int i = 0; i<n; i++){
            st.nextToken();
            arr[i] = (int) st.nval;
        }

    }
}
