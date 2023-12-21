import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=r.nextInt();
        }
        int k=0;
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            if(a[i]%2!=0){
                b[k++]=a[i];
            }
        }
        for (int i = 0; i < k-1; i++) {
            for (int j = 0; j < k-1-i; j++) {
                if(b[j]>b[j+1]){
                    int tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if(i==k-1){
                System.out.print(b[i]);
            }else{
                System.out.print(b[i]+",");
            }
        }

    }
}