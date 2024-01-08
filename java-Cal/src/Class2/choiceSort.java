package Class2;

public class choiceSort {
    //交换两个位置函数
    public static void swap(int[] arr,int n1,int n2){
        int tmp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=tmp;
    }
    //选择排序的代码
    public static void choiceSort(int[] arr){
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            int tmp=arr[i];
            int index=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<tmp){
                    index=j;
                    tmp=arr[j];
                }
            }
            swap(arr,i,index);
        }
    }
    public static void main(String[] args){
        int[] arr={5,7,9,1,2,30,50};
        choiceSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
