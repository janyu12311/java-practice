package Class2;

public class Demo2 {
    public static void process(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int mid=(L+R)>>>1;
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr,int L,int Mid,int R){
        int[] help=new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=Mid+1;
        while(p1<=Mid&&p2<=R){
            help[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=Mid){
            help[i++]=arr[p1++];
        }
        while(p2<=R){
            help[i++]=arr[p2++];
        }
        for(i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }

    }


    public static void main(String[] args){
        int[] arr={2,5,8,6,4,10,3,9};
       process(arr,0,arr.length-1);
    }
}
