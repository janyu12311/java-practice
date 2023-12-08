import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            int tmp=r.nextInt(5);
            int ret=a[i];
            a[i]=a[tmp];
            a[tmp]=ret;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
