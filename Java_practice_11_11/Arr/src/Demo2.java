public class Demo2 {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,4,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr[i]/=2;
            }
            else{
                arr[i]*=2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
