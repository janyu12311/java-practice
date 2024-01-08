package Class2;

public class quickSort {
    public static void swap(int[] arr,int L,int R){
        int tmp=arr[L];
        arr[L]=arr[R];
        arr[R]=tmp;
    }
    public static void quickSort(int[] arr,int L,int R){
        if(L<R){
            swap(arr,L+(int)(Math.random()*(R-L+1)),R);
            int[] p=partition(arr,L,R);
            quickSort(arr,L,p[0]-1);
            quickSort(arr,p[1]+1,R);
        }
    }
    public static int[] partition(int[] arr,int L,int R){
        int less=L-1;
        int more=R;
        while(L<more){
            //小于固定值
            if(arr[L]<arr[R]){
               swap(arr,++less,L++);
            }else if(arr[L]>arr[R]){
                swap(arr,--more,L);
            }else{
                L++;
            }
        }
        swap(arr,more,R);
        int[] p={less+1,more};
        return p;
    }
    public static void main(String[] args){
           int[] arr={2,5,8,4,20,53};
           quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
