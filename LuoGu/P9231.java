import java.util.Scanner;

public class P9231 {

    public static int getJi(int num){
        if(num == 0) return 0;
        return (num + 1) / 2;    
    }
    public static int getOu(int num){
        return num / 4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(getJi(r) - getJi(l-1) + getOu(r) - getJi(l-1));
    }
}