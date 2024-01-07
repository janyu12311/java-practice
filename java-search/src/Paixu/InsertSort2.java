package Paixu;

public class InsertSort2 {
    public static void main(String[] args) {
        int[] arr={4,44,45,3,52,10,6};
        int startIndex=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int tmp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
