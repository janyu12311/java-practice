package com.yuanshen.ZoneDateTime;

import java.text.DateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
//        System.out.println(ZonedDateTime.now());
        ZonedDateTime z1 = Instant.now().atZone(ZoneId.of("Asia/Aqtau"));

        DateTimeFormatter dif1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dif1.format(z1));

    }
}
