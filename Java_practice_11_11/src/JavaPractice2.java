import java.util.Scanner;

public class JavaPractice2 {
    public static void main(String[] args) {
/*        Scanner sc=new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine=sc.nextInt();
        if(wine>2)
        {
            System.out.println("不错");
        }
        else
        {
            System.out.println("一般");
        }*/
        System.out.println("请输入小明的成绩");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=90)
        {
            System.out.println("小明上岸了");
        }
        else{
            System.out.println("小明失败了");
        }
    }
}
