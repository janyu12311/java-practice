package Class2;

public class Demo1 {
    public static int FindMax(int[] arr,int L,int R){
        int mid=(L+R)>>>1;
        if(L==R){
            return arr[L];
        }
        int left=FindMax(arr,L,mid);
        int right=FindMax(arr,mid+1,R);
        return Math.max(left,right);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,20,6,7,8,9};
        System.out.println(FindMax(arr, 0, arr.length - 1));


    }
}
