package Test1;

public class insertSortDome2 {

    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int endIndex=i;
            int tmp=arr[i+1];
            while(endIndex>=0){
                if(arr[endIndex]>tmp){
                    arr[endIndex+1]=arr[endIndex];
                    endIndex--;
                }else{
                    break;
                }
            }
            arr[endIndex+1]=tmp;
        }
    }

    public static void main(String[] args){
        int[] arr={6,5,87,1,0,230,25};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
