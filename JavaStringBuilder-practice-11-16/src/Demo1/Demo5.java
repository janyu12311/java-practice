package Demo1;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(arrToString(arr));

    }
    public static String arrToString(int[] arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]+"]");
            }
            else{
                sb.append(arr[i]+",");
            }
        }
        return sb.toString();
    }
}
