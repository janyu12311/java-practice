import java.util.Scanner;

public class ShangYu {
    public static void main(String[] args) {
        System.out.println("请属于要被除的数字");
        Scanner sc=new Scanner(System.in);
        int beishu=sc.nextInt();
        System.out.println("请属于除的数字");
        int shu=sc.nextInt();
        int num=0;
        int yushu=0;
        while(beishu-shu>=0)
        {
            beishu-=shu;
            num++;
        }
        yushu=beishu;
        System.out.println(num);
        System.out.println(beishu);
    }
}
