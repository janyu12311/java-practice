package com.yuanshen.myIoPractice;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String boyNameNet="https://www.zhihu.com/question/456369981";
        String boyName = webCrawler(boyNameNet);
        ArrayList<String> name=getDate(boyName,"([\u4E00-\u9FA5]{2}\\s{1}){3}([\u4E00-\u9FA5]{2}){1}");
        ArrayList<String> signalName=new ArrayList<>();
        for (String s : name) {
            String[] split = s.split(" ");
            for (String string : split) {
                signalName.add(string);
            }
        }
//        FileUtil.writeLines(signalName,"D:\\桌面\\手术室\\a.txt","UTF-8");

        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\桌面\\手术室\\a.txt"));
        for (String s : signalName) {
            bw.write(s+" ");

        }
        bw.close();



    }

    public static ArrayList<String> getDate(String s,String regex){
        ArrayList<String> list=new ArrayList<>();

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            list.add(matcher.group());
        }
        return list;


    }
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb=new StringBuilder();
        URL url=new URL(net);
        URLConnection uc=url.openConnection();
        InputStreamReader isr=new InputStreamReader(uc.getInputStream());
        int len=0;
        while((len = isr.read()) != -1 ){
            sb.append((char)len);
        }
        isr.close();
        return sb.toString();
    }
}
