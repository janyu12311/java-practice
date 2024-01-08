package Class6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Code4_IPO {
    public static class Programme{
        public int p;
        public int c;
        public Programme(int p,int c){
            this.p=p;
            this.c=c;
        }
        public int FindMaxProfit(int k,int W,int[] Profits,int[] Capital){
            PriorityQueue<Programme> minPrice=new PriorityQueue<>(new Comparator<Programme>() {
                @Override
                public int compare(Programme o1, Programme o2) {
                    return o1.p-o2.p;
                }
            });
            PriorityQueue<Programme> maxProfits=new PriorityQueue<>(new Comparator<Programme>() {
                @Override
                public int compare(Programme o1, Programme o2) {
                    return o2.c-o1.c;
                }
            });
            for (int i = 0; i < Profits.length; i++) {
                 minPrice.add(new Programme(Profits[i],Capital[i]));
            }
            for (int i = 0; i < k; i++) {
                  while(!minPrice.isEmpty()&&minPrice.peek().p<=W){
                      maxProfits.add(minPrice.poll());
                  }
                  if(maxProfits.isEmpty()){
                      return W;
                  }
                  W+=maxProfits.poll().c;
            }
            return W;

        }
    }
}
