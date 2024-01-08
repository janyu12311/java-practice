package Class7;

public class numsToChar {
    public static int transform(String s){
        char[] arr=s.toCharArray();
        return process(arr,0);
    }
    public static int process(char[] str,int i){
        if(i==str.length){
            return 1;
        }
        if(str[i]=='0'){
            return 0;
        }
        if(str[i]=='1'){
            int res=process(str,i+1);
            if(i+1<str.length){
                res+=process(str,i+2);
            }
            return res;
        }
        if(str[i]=='2'){
            int res=process(str,i+1);
            if(i+1<str.length&&str[i+1]>='0'&&str[i+1]<='6'){
                res+=process(str,i+2);
            }
            return res;
        }
        return process(str,i+1);
    }

    public static void main(String[] args) {
        System.out.println(transform("1101"));
    }

}
