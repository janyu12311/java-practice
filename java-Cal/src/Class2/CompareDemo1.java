package Class2;

import java.util.Arrays;
import java.util.Comparator;

public class CompareDemo1 {

    public static void main(String[] args){
      Integer[] arr={2,5,8,10,35,5,1,7};
        Arrays.sort(arr,(o1,o2)->{
                return o2-o1;
            }
        );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }





}
