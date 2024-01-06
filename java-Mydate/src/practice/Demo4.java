package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo4 {
    public static void main(String[] args) {
        LocalDate lc=LocalDate.of(2005,5,8);
        LocalDate end=LocalDate.now();
        long between = ChronoUnit.DAYS.between(lc, end);
        System.out.println(between);

    }
}
