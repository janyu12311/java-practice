package Class7;

import java.util.ArrayList;
import java.util.List;

public class myNumsToChar {
    public static List<List<Character>> transform(String s) {
        List<List<Character>> list=new ArrayList<>();
        progress(s.toCharArray(), 0, new ArrayList<>(), list);
        return list;
    }
    public static void progress(char[] arr, int i, List<Character> newlist, List<List<Character>> list) {
        if (i == arr.length) {
            list.add(newlist);
            return;
        }
        if (i + 1 == arr.length || arr[i] - '0' > 2) {
            List<Character> listTmp = new ArrayList<>(newlist);
            listTmp.add((char) ('a' + arr[i] - '0' - 1));
            progress(arr, i + 1, listTmp, list);
        }
        else if (arr[i + 1] == '0') {
            List<Character> listTmp = new ArrayList<>(newlist);
            int tmp = (arr[i] - '0') * 10 + arr[i + 1] - '0';
            listTmp.add((char)('a'+tmp-1));
            progress(arr, i + 2, listTmp, list);
        }else{
            int tmp = (arr[i] - '0') * 10 + arr[i + 1] - '0';
            List<Character> listTmp = new ArrayList<>(newlist);
            if(tmp>26||(i+2<=arr.length-1&&arr[i+2]=='0')){
                listTmp.add((char) ('a' + arr[i] - '0' - 1));
                progress(arr, i + 1, listTmp, list);
            }else{
                List<Character> listTmp2 = new ArrayList<>(newlist);
                listTmp2.add((char) ('a' + arr[i] - '0' - 1));
                progress(arr,i+1,listTmp2,list);
                listTmp.add((char)('a'+tmp-1));
                progress(arr,i+2,listTmp,list);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Character>> transform = transform("11111");
        for (List<Character> characters : transform) {
            for (Character character : characters) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
