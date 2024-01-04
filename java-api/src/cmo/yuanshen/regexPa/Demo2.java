package cmo.yuanshen.regexPa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})|0\\d{2,3}-?[1-9]\\d{3}|(400-?[1-9]\\d{2,3}-?[1-9]\\d{3})");

        String s1="13";
        Matcher m=p.matcher(s1);
        while(m.find()){
            System.out.println(m.group());
        }



    }
}
