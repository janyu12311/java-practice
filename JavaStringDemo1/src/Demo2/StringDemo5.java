package Demo2;

public class StringDemo5 {
    public static void main(String[] args) {
        String result="你玩tmd的,sb,sb,sb,mlgb";
        String[] arr={"tmd","cnm","sb","mlgb"};
        for (int i = 0; i < arr.length; i++) {
            result=result.replace(arr[i],"***");
        }

        System.out.println(result);
    }
}
