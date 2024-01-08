package Class7;

public class printAllSequence {
    public static void printAllSequence(String s){
        progress(s.toCharArray(),0);
    }
    public static void progress(char[] str,int n){
          if(n==str.length){
              System.out.println(String.valueOf(str));
              return;
          }
          progress(str,n+1);
          char tmp=str[n];
          str[n]=0;
          progress(str,n+1);
          str[n]=tmp;
    }

    public static void main(String[] args) {
        printAllSequence("aba");
    }
}
