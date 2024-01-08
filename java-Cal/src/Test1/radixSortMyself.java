package Test1;

public class radixSortMyself {
    //得到数组中最大位数的值
    public static int  maxBits(int[] arr){
        //假设数组的第一个数据为最大
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        int res=0;
        while(max!=0){
            max/=10;
            res++;
        }
        return res;
    }
   //得到哪一位的值
    public static int getBits(int n,int tmp){
        for(int i=1;i<tmp;i++){
            n/=10;
        }
        return n%10;
    }
    public static void radixSort(int[] arr,int L ,int R){
        if(arr==null&&arr.length<2){
            return;
        }
        radix(arr,L,R,maxBits(arr));
    }
    public static void radix(int[] arr,int L ,int R,int digit){
        int[] bucket=new int[R-L+1];
        for(int i=1;i<=digit;i++){
            int[] count=new int[10];
            //把当前要求位数的值全部存到桶里面
            for (int j = L; j <=R; j++) {
                int tmp=getBits(arr[j],i);
                count[tmp]++;
            }
            //变成前缀和数组
            for(int j=1;j<10;j++){
                count[j]=count[j-1]+count[j];
            }
            int j=0;
            //从后往前遍历数组，保持稳定性
            //把数据存到bucket里面
            for(int k=R;k>=L;k--){
                int tmp=getBits(arr[k],i);
                bucket[count[tmp]-1]=arr[k];
                count[tmp]--;
            }
            //把倒出来的数据放回原数组中
            for(int k=L;k<=R;k++) {
                arr[k] = bucket[j++];
            }
        }
    }

    public static void main(String[] args){
        int[] arr={9,5,1,2,3,45,1,2,354};
        radixSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }






}
