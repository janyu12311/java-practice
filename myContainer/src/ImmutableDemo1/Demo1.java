package ImmutableDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","a");
        hm.put("2","b");
        hm.put("3","c");
        hm.put("4","d");
        hm.put("5","e");
        hm.put("6","f");
        hm.put("7","g");

        Set<Map.Entry<String, String>> entries = hm.entrySet();
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
        Map map = Map.ofEntries(array);
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o+" "+map.get(o));
        }

    }


}
