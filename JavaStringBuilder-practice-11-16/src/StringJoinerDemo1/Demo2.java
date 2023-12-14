package StringJoinerDemo1;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---","[","]");
        System.out.println(sj.add("aaa").add("bbb").add("ccc"));
//        int length = sj.length();
//        System.out.println(length);
//        String str=sj.toString();
//        System.out.println(str);
    }
}
