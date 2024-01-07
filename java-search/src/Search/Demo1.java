package Search;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr={12,45,35,654,78,78};
        ArrayList<Integer> search = Search(arr, 12);
        for (int i = 0; i < search.size(); i++) {
            System.out.println(search.get(i));
        }


    }
    public static ArrayList<Integer> Search(int[] arr,int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                list.add(i);
            }
        }
        return list;

    }
}
