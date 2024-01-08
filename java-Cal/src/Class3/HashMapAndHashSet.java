package Class3;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapAndHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashset1=new HashSet<>();
        hashset1.add(3);
        System.out.println(hashset1.contains(3));
        hashset1.remove(3);
        System.out.println(hashset1.contains(3));


        HashMap<Integer,String> hashMap1=new HashMap<>();
        hashMap1.put(1,"1");
        hashMap1.put(1,"2");
        hashMap1.put(2,"2");
        System.out.println(hashMap1.containsKey(1));
        System.out.println(hashMap1.get(1));
        System.out.println(hashMap1.get(4));
    }
}
