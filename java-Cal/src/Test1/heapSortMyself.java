package Test1;

public class heapSortMyself {
    public static void heapInsert(int[] arr,int index){
        while(arr[index]>arr[(index-1)/2]){
            int tmp=arr[index];
            arr[index]=arr[(index-1)/2];
            arr[(index-1)/2]=tmp;
        }
    }
    public static void heapIfy(int[] arr,int index,int heapSize){
        int left=index*2+1;
        while(left<heapSize){
            int largest=left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
            largest=arr[largest]>arr[index]?largest:index;
            if(largest==index){
                break;
            }
            swap(arr,largest,index);
            index=largest;
            left=index*2+1;
        }
    }
    public static void swap(int[] arr,int L,int R){
        int tmp=arr[L];
        arr[L]=arr[R];
        arr[R]=tmp;
    }
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapIfy(arr,i,arr.length);
        }
        int heapSize=arr.length;
        swap(arr,0,--heapSize);
        while(heapSize>0){
            heapIfy(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }

    }
    public static void main(String[] args){
        int[] arr={9,5,12,4,2,0,1,2};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
