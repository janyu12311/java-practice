package Method;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(",");
        String s1 = s[1];
        String s2 = s[2];
        int s1len = s1.length();//s1的长度
        int s2len = s2.length();//s2的长度
        int maxlen = 0;//最大跨距
        //S1和S2是否同时在S中出现
        if(s[0].contains(s1) && s[0].contains(s2)) {
            int s1at = s[0].indexOf(s1);
            int s2at = s[0].lastIndexOf(s2);

            //且S1位于S2的左边，并在S中互不交叉
            if(s1at + s1len <= s2at) {
                maxlen = s2at - s1at - s1len;
                System.out.println(maxlen);
            }else {
                System.out.println("-1");//在S中没有满足条件的S1和S2
            }
        }else {
            System.out.println("-1");//在S中没有满足条件的S1和S2
        }
    }
}
