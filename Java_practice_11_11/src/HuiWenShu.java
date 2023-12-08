import java.util.Scanner;

public class HuiWenShu {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int tmp=ip;
        int sum=0;
        if(ip<0)
        {
            System.out.println("false");
        }
        while(tmp!=0){
            int ge=tmp%10;
            tmp/=10;
            sum=sum*10+ge;
        }
        if(sum==ip)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
