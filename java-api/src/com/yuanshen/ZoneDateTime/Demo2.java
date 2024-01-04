package com.yuanshen.ZoneDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1999; i < 10000; i += 100) {
            LocalDate l1 = LocalDate.of(i, 12, 31);
            DayOfWeek dayOfWeek = l1.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                System.out.println(i);
                break;
            }
        }
    }
}
