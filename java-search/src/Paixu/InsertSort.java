package Paixu;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={4,44,45,3,52,10,6};
        int count=1;
        for(int i=1;i<arr.length;i++){
            for(int j=count-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
