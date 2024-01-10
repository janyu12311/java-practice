package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8","9","10");
        Boolean[] ba=new Boolean[list.size()];
        Arrays.fill(ba,false);
        Random r=new Random();
        for(int i=0;i<5;i++){
            for (int i1 = 0; i1 < list.size(); i1++) {
                int random = r.nextInt(list.size());
                if(ba[random]){
                    i1--;
                    continue;
                }
                ba[random]=true;
                System.out.print(list.get(random)+" ");
            }
            System.out.println();
            System.out.println("------------------------------------------");
            Arrays.fill(ba,false);
        }
    }
}
