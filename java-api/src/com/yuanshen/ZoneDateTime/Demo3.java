package com.yuanshen.ZoneDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo3 {
    public static void main(String[] args) {
        for (int century = 20; century <= 21; century++) {
            int year = century * 100 - 1; // 世纪末的年份
            LocalDate lastDay = LocalDate.of(year, 12, 31);
            DayOfWeek dayOfWeek = lastDay.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.MONDAY)) {
                System.out.println("世纪末的最后一天是星期一：" + lastDay);
                break;
            }
        }
    }
}
