package System;

public class Demo1 {
    public static void main(String[] args) {
    //     System.exit(0);
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2=new int[9];
        System.arraycopy(arr1,0,arr2,0,9);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }





    }
}
