import java.util.Random;
import java.util.Scanner;

public class SuiJiShu {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            int ip=sc.nextInt();
            if(ip<num){
                System.out.println("小了");
            }
            else if(ip>num){
                System.out.println("大了");
            }
            else{
                System.out.println("猜对了,数字就是"+ip);
                break;
            }

        }
    }
}
