package Paixu;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
