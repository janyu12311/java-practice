package Class7;

public class hanoi {
    public static void hanoi(int n){
        if(n>0){
            func(n,"左","中","右");
        }
    }
    public static void func(int n,String start,String end,String other){
        if(n==1){
            System.out.println("Move 1 从"+start+"移动到"+end);
        }else{
            func(n-1,start,other,end);
            System.out.println("Move "+n+"从"+start+"移动到"+end);
            func(n-1,other,end,start);
        }

    }

    public static void main(String[] args) {
        hanoi(3);
    }
}
