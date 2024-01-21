package com.yuanshen.IoText;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("D:\\桌面\\手术室\\sort.txt");
        StringBuilder sb = new StringBuilder();
        int len = 0;
        while ((len = fis.read()) != -1) {
            sb.append((char) len);
        }
        String sort = sb.toString();
        String[] nums = sort.split("-");
        Integer[] numsR = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsR[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numsR);

        FileWriter fw = new FileWriter("D:\\桌面\\手术室\\NewSort.txt");

        fw.write(Arrays.toString(numsR));

        fw.close();
        fis.close();


    }
}
