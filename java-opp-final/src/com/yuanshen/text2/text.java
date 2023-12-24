package com.yuanshen.text2;

public class text {
    public static void main(String[] args) {
        final Student S=new Student(23,"张三");
        S.setName("李四");
        final int[] ARR={1,2,3,4,5,6};
        ARR[0]=78;
        for (int i = 0; i < ARR.length; i++) {
            System.out.printf(" "+ARR[i]);
        }



    }
}
