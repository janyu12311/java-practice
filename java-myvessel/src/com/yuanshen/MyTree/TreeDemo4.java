package com.yuanshen.MyTree;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeDemo4 {

    public static void main(String[] args){
        //编写比较函数
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int TotalScoreO1=o1.getChineseScore()+o1.getEnglishScore()+o1.getMathScore();
                int TotalScoreO2=o2.getChineseScore()+o2.getEnglishScore()+o2.getMathScore();
                if(TotalScoreO1!=TotalScoreO2){
                    return TotalScoreO2-TotalScoreO1;
                }else{
                    if(o2.getChineseScore()!=o1.getChineseScore()){
                        return o2.getChineseScore()-o1.getChineseScore();
                    }else{
                        if(o1.getMathScore()!=o2.getMathScore()){
                            return o2.getMathScore()-o1.getMathScore();
                        }else{
                            if(o1.getEnglishScore()!=o2.getEnglishScore()){
                                return o2.getEnglishScore()-o1.getEnglishScore();
                            }else{
                                if(o1.getAge()!=o2.getAge()){
                                    return o2.getAge()-o1.getAge();
                                }else{
                                    return o1.getName().compareTo(o2.getName());
                                }
                            }
                        }
                    }
                }
            }
        });

        Student s1=new Student("张三",23,90,99,50);
        Student s2=new Student("李四",24,90,98,50);
        Student s3=new Student("王五",25,95,100,30);
        Student s4=new Student("赵六",26,60,99,70);
        Student s5=new Student("钱七",26,70,80,70);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student t : ts) {
            System.out.println(
        }
    }
}
