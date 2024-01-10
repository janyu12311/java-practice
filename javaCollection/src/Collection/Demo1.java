package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"abc","21312","ba","sd","qew","zx","bva");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
