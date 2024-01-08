package Class2;

public class radixSort {

    //计算最大的数的位数是多少
    public static int maxBits(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        int res=0;
        while(max!=0){
            res++;
            max/=10;
        }
        return res;
    }
    //获取各个位数的值，1就是个位，2就是百位
    public static int getBits(int n,int d){
        for(int i=1;i<d;i++){
            n/=10;
        }
        return n%10;
    }
    public static void radixSort(int[] arr,int L,int R,int digit){
        final int radix=10;
        //用来存放小于等于当前位数的值
        int i=0,j=0;
        int k=0;
        int d=0;
        int[] bucket=new int[R-L+1];
        for(i=1;i<=digit;i++){
            int[] count=new int[radix];
            for(j=L;j<=R;j++){
                //获取当前位数的值
                int tmp=getBits(arr[j],i);
                count[tmp]++;
            }
            for( d=1;d<radix;d++){
                //让数组存的值变成小于等于当前位数的数量
                count[d]=count[d]+count[d-1];
            }
            //把一次排序的数组存到bucket里面
            for( d=R;d>=L;d--){
                int tmp=getBits(arr[d],i);
                bucket[count[tmp]-1]=arr[d];
                count[tmp]--;
            }
            //把bucket里的数组的值放回arr中去
            for(d=L,k=0;d<=R;d++) {
                arr[d] = bucket[k++];
            }
        }

    }
    public static void main(String[] args){
          int[] arr={120,35,546,80,650,735,12354};
          radixSort(arr,0,arr.length-1,maxBits(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



}
