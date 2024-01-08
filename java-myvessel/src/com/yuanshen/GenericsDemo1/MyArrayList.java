package com.yuanshen.GenericsDemo1;

import java.util.Arrays;

//定义为泛型类
public class MyArrayList <E>{

    Object[] obj=new Object[10];
    int size;

    //E:表示是不确定的类型，该类型在类后面已经定义过了
    //e表示的是一个变量

    public boolean add(E e){
       obj[size++]=e;
       return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
