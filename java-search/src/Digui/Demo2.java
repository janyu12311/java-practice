package Digui;

public class Demo2 {
    public static int cal(int n){
        if(n==1){
            return 1;
        }
        return n*cal(n-1);
    }
    public static void main(String[] args) {
        int cal = cal(5);
        System.out.println(cal);
    }
}
