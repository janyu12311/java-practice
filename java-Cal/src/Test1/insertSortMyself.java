package Test1;

public class insertSortMyself {
    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //这是有序数组的最后一位元素的下标
            int endIndex=i;
            //这是要插入的元素
            int tmp=arr[endIndex+1];
            while(endIndex>=0){
                //如果要插入的元素小于有序数组的元素
                //有序数组被比较的那个元素会往后移，enIndex--，所以如果当循环停下来的时候，应该是endIndex+1才是
                //要插入元素因在的位置
                if(tmp<arr[endIndex]){
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
        int[] arr={5,3,4,8,6,3,20,35,5};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
