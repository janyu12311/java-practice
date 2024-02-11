public class L2022SB1{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int start = 5;
        int tmp = 20;
        for(int i = 0; i<21; i++){
            tmp *=20;
            tmp %= 7;
        }
        start += tmp;
        start %= 7;
        System.out.println(a[start]);
    }
}