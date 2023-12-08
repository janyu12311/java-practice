import java.util.Scanner;

public class PingFangGen {
    public static void main(String[] args) {
        int m=0;
        System.out.println("请输入一个数字");
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int cout=0;
        while(m*m<=ip){
            m++;
            cout++;
        }
        System.out.println(cout-1);
    }
}
