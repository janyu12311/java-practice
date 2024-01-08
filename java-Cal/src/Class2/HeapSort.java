package Class2;

public class HeapSort {
    //进行插入的
    public static void heapInsert(int[] arr, int index) {
        //这里有点心思，因为-1/2在java中是等于0的，所以这里不用判断index是否会越界
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //进行交换的
    public static void swap(int[] arr, int L, int R) {
        int tm = arr[L];
        arr[L] = arr[R];
        arr[R] = tm;
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //通过大根堆的规则把数字放进去(并非最优解)
        for (int i = 0; i < arr.length; i++) {//O(n)
            heapInsert(arr, i);//O(logN)其实就是树的高度
        }

        //有一个插入优解
     /*   for(int i=arr.length-1;i>=0;i++){
            heapIfy(arr,i,arr.length);//这整个算法就是O(n)的时间复杂度
        }*/

        int heapSize = arr.length;
        //先把堆的第一个数据和最后一个互换
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            //除非heapSize小于0，则交换会不断的下去
            heapIfy(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }

    }

    //用来判断index索引的位置的数据是不是处于正确的位置上
    public static void heapIfy(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    //主函数
    public static void main(String[] args) {
        int[] arr = {2, 3, 54, 8, 50, 10, 1, 5, 4, 90};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
