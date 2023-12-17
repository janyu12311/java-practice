public class Insert {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr.length-1; i++) {
            int end=i;
            int tmp=arr[end+1];
            while(end>=0){
                if(tmp<arr[end]){
                    arr[end+1]=arr[end];
                    end--;
                }
                else{
                    break;
                }
            }
            arr[end+1]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
