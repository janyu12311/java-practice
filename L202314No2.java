package javaTest;

import java.util.Scanner;

public class L202314No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int minY = Math.min(y1,y3);
        int minX = Math.min(x1,x3);
        
        int maxY = Math.max(y2,y4);
        int maxX = Math.max(x2,x4);
        
        
        long ans = 0;
        
        for(int i = minY; i< maxY ;i++){
            if(i>=y1&&i< y2 || i>=y3&&i< y4 ){
                for(int j = minX; j<= maxX; j++){
                    int t = j;

                    if(j<=x1) t = x1;
                    if(j<=x3) t = x3;

                    if(j<=x1&&j<=x3){
                        t = Math.min(x1,x3);
                    }

                    j = t;
                    if((i>=y1&&i<y2) && (j>=x1&&j<=x2)){
                        ans += x2 - j;
                        j = x2;
                    }
                    if((i>=y3&&i<y4) && (j>=x3&&j<=x4)){
                        ans += x4 - j;
                        j = x4;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
