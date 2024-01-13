package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class GetStreamDemo1 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","a");
        hm.put("2","b");
        hm.put("3","c");
        hm.put("4","d");
        hm.put("&4","e");
        hm.put("8674","f");
        hm.put("24","g");
        hm.entrySet().stream().forEach(stringStringEntry -> System.out.println(stringStringEntry));


    }
}
