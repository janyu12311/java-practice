package Test1;

public class quickSortMyself {
    public static void swap(int[] arr, int scr, int des) {
        int tmp = arr[scr];
        arr[scr] = arr[des];
        arr[des] = tmp;
    }

    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            //小于固定值
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                //交换
                swap(arr, L, --more);
            } else {
                L++;
            }
        }
        //把右边界一开头的位置的数跟比较的数进行交换
        swap(arr, more, R);
        //因为less一定小于比较值，所以less要进1
        int[] p = {less + 1, more};
        return p;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 20, 1, 3, 9, 22};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
