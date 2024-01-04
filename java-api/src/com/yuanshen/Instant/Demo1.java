package com.yuanshen.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {
    public static void main(String[] args) {
//        Instant now=Instant.now();
//        System.out.println(now);
//        Instant ins1 = Instant.ofEpochMilli(0L);
//        System.out.println(ins1);
//        Instant instant = Instant.ofEpochMilli(1L);
//        System.out.println(instant);
        ZonedDateTime z1 = Instant.now().atZone(ZoneId.of("Asia/Aqtau"));
        System.out.println(z1);


    }
}
