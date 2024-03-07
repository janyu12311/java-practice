import java.util.Scanner;

public class 耐摔指数2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[105];
        int[] c = new int[105];
        int i = 0;
        while(c[i] < n){
            i++;
            b[i] = i + b[i-1];
            c[i] = c[i-1] + b[i-1] + 1;
        }
        System.out.println(i);
    }
    
}
