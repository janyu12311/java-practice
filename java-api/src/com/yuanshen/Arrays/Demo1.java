package com.yuanshen.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
//        int[] newArr= Arrays.copyOf(arr,20);
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+" ");
//        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1==o2){
                    return 0;
                }
                return o1>o2?1:-1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
