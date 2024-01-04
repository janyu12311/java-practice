package Math;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {

            if(isNumber(i)){
                System.out.println(i);
            }
        }


    }

    public static boolean isNumber(int number){
        int tmp=number;
        int count=0;
        while(tmp!=0){
            count++;
            tmp/=10;
        }
        tmp=number;
        int sum=0;
        while(tmp!=0){
            int n=tmp%10;
            sum+=Math.pow(n,count);
            tmp/=10;
        }
        if(sum==number){
            return true;
        }
        else{
            return false;
        }
    }

}
