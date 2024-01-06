package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(sum<200){
            Integer tmp=Integer.valueOf(s.nextInt());
            sum+=tmp;
            a1.add(tmp);
        }
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i)+" ");
        }
    }
}
