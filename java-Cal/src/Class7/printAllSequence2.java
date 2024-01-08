package Class7;

import java.util.ArrayList;

public class printAllSequence2 {
    public static ArrayList<String> printAllSequence(String s){
        ArrayList<String> list=new ArrayList<>();
        progress(s.toCharArray(),0,list);
        return list;
    }
    public static void progress(char[] str, int i, ArrayList<String> res){
         if(i==str.length){
             res.add(String.valueOf(str));
         }
         boolean[] visit=new boolean[26];
         for(int j=i;j<str.length;j++){
             if(!visit[str[j]-'a']){
                 visit[str[j]-'a']=true;
                 swap(str,i,j);
                 progress(str,i+1,res);
                 swap(str,i,j);
             }
         }
    }
    public static void swap(char[] str,int i,int j){
        char tmp=str[i];
        str[i]=str[j];
        str[j]=tmp;
    }

    public static void main(String[] args) {
        ArrayList<String> list = printAllSequence("aba");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
