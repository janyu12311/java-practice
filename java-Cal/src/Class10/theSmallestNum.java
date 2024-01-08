package Class10;

public class theSmallestNum {
    public static int f(int sum,int[] arr,int bigSum,int small,int i){
        if(sum==bigSum){
            return small;
        }
        if(i==arr.length){
            return 0;
        }
        if(sum>bigSum){
            return 0;
        }
        int tmp=0;
        if(f(sum,arr,bigSum,small,i+1)!=0&&f(sum+arr[i],arr,bigSum,small+1,i+1)!=0){
            tmp=Math.min(f(sum,arr,bigSum,small,i+1),f(sum+arr[i],arr,bigSum,small+1,i+1));
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr={2,7,3,5,3};
        System.out.println(f(0,arr,10,0,0));
    }
}
