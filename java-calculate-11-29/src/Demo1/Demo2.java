package Demo1;

public class Demo2 {

    public static int[] singleNumber(int[] nums) {
        int n=nums.length;
        int n1=0;
        for(int i=0;i<n;i++){
            n1^=nums[i];
        }
        int tmp=n1&(~n1+1);
        int ip1=0;
        int ip2=0;
        for(int i=0;i<n;i++){
            if((nums[i]&tmp)!=0){
                ip1^=nums[i];
            }
            else{
                ip2^=nums[i];
            }
        }
        int[] arr={ip1,ip2};
        return arr;

    }


    public static void main(String[] args) {
        String s="123";


    }


}
