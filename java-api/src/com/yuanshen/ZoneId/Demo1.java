package com.yuanshen.ZoneId;

import java.time.ZoneId;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(availableZoneIds);
        System.out.println(availableZoneIds.size());
        System.out.println(zoneId);

        ZoneId zon2 = ZoneId.of("Asia/Aqtau");
        System.out.println(zon2);

    }
}
