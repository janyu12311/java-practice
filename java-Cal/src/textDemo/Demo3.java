package textDemo;

import java.util.Scanner;

public class Demo3 {
    public static int progress(int[] weight,int[] values,int alreadyWeight,int alreadyValues,int i,int bigWeight){
        if(bigWeight<alreadyWeight){
            return 0;
        }
        if(i == values.length){
            return alreadyValues;
        }
        return Math.max( progress(weight,values,alreadyWeight,alreadyValues,i+1,bigWeight),
                progress(weight,values,alreadyWeight+weight[i],
                        alreadyValues+values[i],
                        i+1,bigWeight));
    }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int N=sc.nextInt();
           int bigWeight=sc.nextInt();
           int[] weight=new int[N];
           int[] values=new int[N];
           for (int i = 0; i < N; i++) {
             weight[i]=sc.nextInt();
             values[i]=sc.nextInt();
          }
        System.out.println(progress(weight, values, 0, 0, 0, bigWeight));
    }


}
