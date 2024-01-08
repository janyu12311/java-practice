package Class3;

import java.util.TreeMap;

public class TreeSetAndTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap1=new TreeMap<>();
        treeMap1.put(1,"我是1");
        treeMap1.put(7,"我是7");
        treeMap1.put(8,"我是8");
        treeMap1.put(2,"我是2");
        treeMap1.put(10,"我是10");
        treeMap1.put(4,"我是4");
        treeMap1.put(5,"我是5");
        System.out.println(treeMap1.firstKey());
        System.out.println(treeMap1.lastKey());
        System.out.println(treeMap1.floorKey(11));
        System.out.println(treeMap1.ceilingKey(11   ));

    }
}
