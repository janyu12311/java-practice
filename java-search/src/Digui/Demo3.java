package Digui;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
      int[] arr={6,1,2,8,10,7,9,33,12};
//        int[] arr=new int[1000000];
//        Random r=new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=r.nextInt();
//        }
//        long start=System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
//        long end=System.currentTimeMillis();
//
//        System.out.println(end-start);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr,int i,int j){

        int start=i;
        int end=j;
        if(start>end){
            return;
        }
        int baseNumber=arr[i];
        while(start!=end){
            while(true){
                if(end<=start||arr[end]>baseNumber){
                    break;
                }
                end--;
            }
            while(true){
                if(end<=start||arr[start]<baseNumber){
                    break;
                }
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        //归位
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        //继续
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);

    }
}
