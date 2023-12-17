public class shellSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int len=arr.length;
        int gap=len;
        while(gap>1){
            gap/=2;
            for(int i=0;i<len-gap;i++) {
                int end = i;
                int tmp = arr[end + gap];
                while (end >= 0) {
                    if (tmp < arr[end]) {
                        arr[end + gap] = arr[end];
                        end -= gap;
                    } else {
                        break;
                    }
                }
                arr[end + gap] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
