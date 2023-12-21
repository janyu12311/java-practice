import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Person[] p=new Person[n];
        for (int i = 0; i < n; i++) {
            p[i]=new Person(s.next(),s.nextDouble());
        }

        double[] a=new double[n];
        int right=n-1;
        int left=0;
        for (int i = 0; i < n; i++) {
            if(p[i].sex.equals("male")){
                a[left]=p[i].high;
                left++;
            }
            else{
                a[right]=p[i].high;
                right--;
            }
        }
        Arrays.sort(a,0,left);
        for (int i = right+1; i <n-1; i++) {
            for (int j = right+1; j < n-1; j++) {
                if(a[j]<a[j+1]){
                    double tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ",a[i]);
        }




    }
}
class Person{

    //成员
    String sex;
    double high;

    public Person() {
    }

    public Person(String sex, double high) {
        this.sex = sex;
        this.high = high;
    }

}