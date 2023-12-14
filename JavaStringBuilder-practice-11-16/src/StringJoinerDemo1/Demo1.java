package StringJoinerDemo1;

import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj.add("aaa").add("bbb").add("ccc"));

    }
}
