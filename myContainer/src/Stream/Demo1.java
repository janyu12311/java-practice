package Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        list.stream().forEach(s -> System.out.print(s+" "));
    }
}
