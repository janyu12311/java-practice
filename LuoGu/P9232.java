import java.util.Scanner;

public class P9232 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] crs = sc.nextLine().toCharArray();
        long ans = 0;
        int len = crs.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j<len; j++){
                if(crs[i] > crs[j]) ans ++;
                else if(crs[i] == crs[j]){
                    boolean ok = true;
                    int left = i + 1; int right = j - 1;
                    while(left < j && right > i){
                        if(crs[left] < crs[right]){ok = false; break;}
                        else if(crs[left] > crs[right]){break;}
                        left ++; right --;
                    }
                    if(ok && left < right){ 
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
