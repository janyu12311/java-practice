package MethodPractice;

public class Practice2 {
    public static void main(String[] args) {
        int count=0;
        boolean flag=true;
        for(int i=101;i<=200;i++){
            for(int k=2;k*k<=i;k++){
                flag=true;
                if(i%k==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i+"是素数");
                count++;
            }
        }
        System.out.println("有"+count+"个素数");
    }
}
