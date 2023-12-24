package com.yuanshen.text;

public class text1 {
    public static void main(String[] args) {
        final int a = 10;

    }
}

class Fu {
    public void show() {
        System.out.println("我是父类");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("我是子类");
    }
}