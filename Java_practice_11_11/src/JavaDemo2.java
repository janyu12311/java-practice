import java.util.Scanner;

public class JavaDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入开始的数字");
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        System.out.println("请输入结束的数字");
        int end=sc.nextInt();
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%3==0&&i%5==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
