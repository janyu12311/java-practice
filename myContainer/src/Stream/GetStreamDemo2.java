package Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class GetStreamDemo2 {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5};
        Arrays.stream(arr).forEach(s-> System.out.print(s));
        System.out.println("-------------------------------");
        Stream.of(5, 1, 2, 546, 353, 21, 34, 789).forEach(s-> System.out.println(s));

    }
}
