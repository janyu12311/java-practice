package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo5 {
    public static void main(String[] args) {
        LocalDateTime date=LocalDateTime.now();
        for(int i=1999;i<=2023;i++){
            date.withYear(i);
            if(date.is){
                System.out.println(i);
            }
        }
    }
}
