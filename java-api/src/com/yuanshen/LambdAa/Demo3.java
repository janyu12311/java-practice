package com.yuanshen.LambdAa;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        String[] a={"邓子龙","暗恋","何昊小女友"};
        Arrays.sort(a, (String o1, String o2)->
                (o1.length()-o2.length())
        );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
