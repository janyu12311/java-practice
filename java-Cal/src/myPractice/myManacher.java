package myPractice;

public class myManacher {
    public static char[] toSpecStr(char[] arr) {
        char[] newArr = new char[arr.length * 2 + 1];
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (1 & i) == 0 ? '#' : arr[index++];
        }
        return newArr;
    }
    public static int manacher(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        char[] arr=toSpecStr(s.toCharArray());
        int C=-1;
        int R=-1;
        int[] next=new int[arr.length];
        next[0]=-1;
        next[1]=1;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            next[i]=R>i?Math.min(next[2*C-i],R-i):1;
            while(i-next[i]>-1&&i+next[i]<arr.length){
                if(i+next[i]==i-next[i]){
                    next[i]++;
                }else{
                    break;
                }
            }
            if(i+next[i]>R){
                R=i+next[i];
                C=i;
            }
            max=Math.max(max,next[i]);
        }
        return max-1;
    }


}
