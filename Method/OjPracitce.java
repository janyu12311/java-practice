package Method;

import java.util.Scanner;

public class OjPracitce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int i=0;
        for(i=s.length-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }
    }
}
