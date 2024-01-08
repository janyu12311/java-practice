package Class2;

public class SmallNum {
    public static int process(int[] arr,int L,int R){
        if(L==R){
            return 0;
        }
        int mid=(L+R)>>>1;
        return process(arr,L,mid)+process(arr,mid+1,R)+reg(arr,L,mid,R);
    }
    public static int reg(int[] arr,int L,int mid,int R){
        int reg=0;
        int p1=L;
        int p2=mid+1;
        int i=0;
        int[] help=new int[R-L+1];
        while(p1<=mid&&p2<=R){
            reg+=arr[p1]<arr[p2]?(R-p2+1)*arr[p1]:0;
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        while(p2<=R){
            help[i++]=arr[p2++];
        }
        for(i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }
        return reg;
    }

    public static void main(String[] args) {
     

    }
}
