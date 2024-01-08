package Test1;

public class mergeSortMyself {
    public static void progress(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = (L + R) >>> 1;
        progress(arr, L, mid);
        progress(arr, mid + 1, R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr, int L, int mid,int R){
        int left=L;
        int right=mid+1;
        int[] help=new int[R-L+1];
        int i=0;
        while(left<=mid&&right<=R){
           help[i++]=arr[left]<arr[right]?arr[left++]:arr[right++];
        }
        //判断哪个数组是没存完的
        while(left<=mid){
            help[i++]=arr[left++];
        }
        while(right<=R){
            help[i++]=arr[right++];
        }
        int j=0;
        for(i=L,j=0;i<=R;i++){
            arr[i]=help[j++];
        }
    }
        public static void main(String[] args){
            int[] arr={5,8,4,30,58,9,40};
            progress(arr,0,arr.length-1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}
