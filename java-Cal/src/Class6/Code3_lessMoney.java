package Class6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Code3_lessMoney {
    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }
        int sum=0;
        while(!priorityQueue.isEmpty()){
            int cur=priorityQueue.poll()+priorityQueue.poll();
            priorityQueue.add(cur);
            sum+=cur;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={5,6,4,2,3,4};
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(priorityQueue.poll()+" ");
        }
    }
}
