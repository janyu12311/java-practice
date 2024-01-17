package com.yuanshen.myIoPractice;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HtmlUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String boyNameNet="https://www.zhihu.com/question/456369981";
        String s = HttpUtil.get(boyNameNet);
        List<String> all = ReUtil.findAll("([\u4E00-\u9FA5]{2}\\s{1}){3}([\u4E00-\u9FA5]{2}){1}", s, 0);
        System.out.println(all);
        ArrayList<String> signalName=new ArrayList<>();
        for (String string : all) {
            String[] split = string.split(" ");
            for (String s1 : split) {
                signalName.add(s1);
            }
        }
        FileUtil.writeLines(signalName,"D:\\桌面\\手术室\\a.txt","UTF-8");


    }

}
