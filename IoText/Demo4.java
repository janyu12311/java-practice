package com.yuanshen.IoText;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\桌面\\手术室\\sort.txt");
        StringBuilder sb = new StringBuilder();
        int len = 0;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();
        Integer[] arr = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        String str = Arrays.toString(arr);
        System.out.println(str);
        String str2 = str.replace(", ", "-");
        System.out.println(str2.substring(1, str2.length() - 1));
    }
}
