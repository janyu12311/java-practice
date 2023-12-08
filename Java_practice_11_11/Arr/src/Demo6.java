public class Demo6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
/*        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }*/
        int i=0,j=0;
        for(i=0,j=arr.length-1;i<j;i++,j--){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        System.out.println("\n");
        for( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
