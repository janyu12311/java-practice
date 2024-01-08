import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    public static void fsd(int u,int[] path,int[] use){
        if(u==M){
            for (int i = 0; i < path.length; i++) {
                System.out.print(path[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if(use[i]==1){
                continue;
            }
            if(u!=0&&path[u-1]>i){
                continue;
            }
            use[i]=1;
            path[u]=i;
            fsd(u+1,path,use);
            use[i]=0;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        M=s.nextInt();
        int[] path=new int[M];
        int[] use=new int[N+1];
        fsd(0,path,use);
    }
}