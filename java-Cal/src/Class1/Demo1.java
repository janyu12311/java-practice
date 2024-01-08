package Class1;

public class Demo1 {
    public static void main(String[] args){
        int[] arr={1,1,3,3,5,6};
        int n1=0;
        for(int i=0;i<arr.length;i++){
            n1^=arr[i];
        }
        int Fist1=n1&(~n1+1);
        int onlyOne=0;
        for(int cur:arr){
            if((cur&Fist1)!=0){
                onlyOne ^=cur;
            }
        }
        System.out.println(onlyOne+" "+(n1^onlyOne));

    }
}
