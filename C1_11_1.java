import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1_11_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        int n = Integer.parseInt(tmp);
        tmp = br.readLine();
        int[] arr = new int[n];
        String[] nums = tmp.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        int L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            int find = Integer.parseInt(br.readLine());
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = (left + right) >>> 1;
                if (arr[mid] >= find) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if(left >= n){
                left = n-1;
                System.out.println(arr[left]);
            }
            else if(left <0){
                left=  0;
                System.out.println(arr[left]);
            }else{
                if(arr[left]-find > arr[left-1]-find){
                    System.out.println(arr[left-1]);
                }else if(arr[left]-find < arr[left-1]-find){
                    System.out.println(arr[left]);
                }else{
                    System.out.println(arr[left-1]);
                }
            }
            
        }
    }
}
