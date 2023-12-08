import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100)+1;
        }

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        int cout=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                cout++;
            }
        }
        System.out.println("和"+sum);
        System.out.println("平均数"+avg);
        System.out.println("小于平均数"+cout);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
