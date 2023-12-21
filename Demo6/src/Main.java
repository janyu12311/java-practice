import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Patient[] patient=new Patient[n];
        for (int i = 0; i < n; i++) {
            patient[i]=new Patient(s.next(),s.nextInt());
        }
        Patient[] output=new Patient[n];
        int left=0;
        int right=n-1;
        for (int i = n-1; i >=0; i--) {
            if(patient[i].age>=60){
                output[left]=patient[i];
                left++;
            }else{
                output[right]=patient[i];
                right--;
            }
        }
        int tmp1=left;
        right=left-1;
        left=0;
        while(left<=right){
            Patient tmp=new Patient();
            tmp=output[right];
            output[right]=output[left];
            output[left]=tmp;
            left++;
            right--;
        }
        Arrays.sort(output,0,tmp1);

        for (int i = 0; i < n; i++) {
            System.out.println(output[i].id);
        }


    }
}
class Patient  implements Comparable<Patient>{
    String id;
    int age;

    public Patient() {
    }

    public Patient(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(Patient o) {
        if(o.age==this.age){
            return 0;
        }
        return o.age>this.age?1:-1;
    }
}