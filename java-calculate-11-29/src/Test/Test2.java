package Test;

import java.util.Random;

public class Test2 {
    public static void FastSort(int[] arr,int L,int R){
        int start=L;
        int length = arr.length;
        int left=L;
        int right=R;
        if(left>=right){
            return;
        }
        while(left!=right){
            while(true){
                if(left>=right||arr[right]<arr[start]){
                    break;
                }else{
                    right--;
                }
            }

            while(true){
                if(left>=right||arr[left]>arr[start]){
                    break;
                }
                left++;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
        int tmp=arr[start];
        arr[start]=arr[left];
        arr[left]=tmp;
        FastSort(arr,L,left-1);
        FastSort(arr,left+1,R);
    }
    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[100000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start = System.currentTimeMillis();
//        BubbleSort(arr);
        FastSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
