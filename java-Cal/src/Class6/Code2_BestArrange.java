package Class6;

import java.util.Arrays;
import java.util.Comparator;

public class Code2_BestArrange {
    public class Programme{
        public int start;
        public int end;
        public Programme(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static int bestArrange(Programme[] programmes,int timePoint){
        Arrays.sort(programmes, new Comparator<Programme>() {
            @Override
            public int compare(Programme o1, Programme o2) {
                return o1.end-o2.end;
            }
        });
        int result=0;
        for(int i=0;i<programmes.length;i++){
            if(programmes[i].start>=timePoint){
                result++;
                timePoint=programmes[i].end;
            }
        }
        return result;
    }

}
