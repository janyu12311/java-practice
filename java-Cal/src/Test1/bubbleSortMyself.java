package Test1;

public class bubbleSortMyself {
    //交换的方法
    public static void swap(int[] arr,int L ,int R ){
        int tmp=arr[L];
        arr[L]=arr[R];
        arr[R]=tmp;
    }
    //冒泡排序实现方法
    public static void bubbleSort(int[] arr){
        //i只需要走arr.length-1次，因为走完arr.length后最后一个数字也会自己确定了
        for (int i = 0; i < arr.length-1; i++) {
            //j走的次数会随着i的增加而减少
            for(int j=0;j<arr.length-1-i;j++){
                //如果判断前一个数大于后一个数，进行交换
                if(arr[j]>arr[j+1]){
                   swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5,8,1,3,5,6,1,0,12};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



}
