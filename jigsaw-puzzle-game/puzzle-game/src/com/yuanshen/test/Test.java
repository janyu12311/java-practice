package com.yuanshen.test;

import javax.swing.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] tmpArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < tmpArr.length;i++) {
            Random r=new Random();
            int index=r.nextInt(tmpArr.length);
            int temp=tmpArr[index];
            tmpArr[index]=tmpArr[i];
            tmpArr[i]=temp;
        }
        //遍历数组
        for (int i = 0; i < tmpArr.length; i++) {
            System.out.print(tmpArr[i]+" ");
        }
        System.out.println();
        //创建一个二维数组
        int[][] data=new int[4][4];

        for (int i = 0; i < tmpArr.length; i++) {
            data[i/4][i%4]=tmpArr[i];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }





    }

}
