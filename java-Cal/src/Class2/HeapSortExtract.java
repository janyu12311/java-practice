package Class2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSortExtract {
    public static void sortedArrDistanceLessK(int[] arr,int k){
        int index=0;
        PriorityQueue<Integer> newHeap=new PriorityQueue<>();
        for(;index<Math.min(arr.length,k);index++){
                   newHeap.add(arr[index]);
        }
        int i=0;
        for(;index<arr.length;i++,index++){
            newHeap.add(arr[index]);
            arr[i]=newHeap.poll();
        }
        while(!newHeap.isEmpty()){
            arr[i++]=newHeap.poll();
        }
    }
    public static void main(String[] args){
        PriorityQueue<Integer> heap=new PriorityQueue<>((o1,o2)->{
                return o2-o1;
            }
        );
        heap.add(8);
        heap.add(4);
        heap.add(5);
        heap.add(13);
        heap.add(1);
        heap.add(2);
        while(!heap.isEmpty()){
            System.out.print(heap.poll()+" ");
        }

    }



}
