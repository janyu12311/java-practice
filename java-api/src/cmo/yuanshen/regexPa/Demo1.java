package cmo.yuanshen.regexPa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {

        String str1 = "原神是世界上最好玩的游戏Java11,Java";

        Pattern p = Pattern.compile("Java\\d{0,2}");

        Matcher matcher = p.matcher(str1);
        while(matcher.find()){
            System.out.println(matcher.group());


        }


    }
}
