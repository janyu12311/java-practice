package com.yuanshen.LambdAa;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Integer[] arr={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr, (o1, o2)->o1-o2
        );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
