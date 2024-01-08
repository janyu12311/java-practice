package Class8;

public class isLand {
    public static int findIsland(int[][] a){
        if(a==null||a[0]==null){
            return 0;
        }
        int N=a.length;
        int M=a[0].length;
        int res=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(a[i][j]==1){
                    res++;
                    infect(a,i,j,N,M);
                }
            }
        }
        return res;
    }

    public static void infect(int[][] a,int i,int j,int N,int M){
         if(a[i][j]!=1||i<0||i>=N||j<0||j>=M){
             return;
         }
         a[i][j]=2;
         infect(a,i+1,j,N,M);
         infect(a,i-1,j,N,M);
         infect(a,i,j+1,N,M);
         infect(a,i,j-1,N,M);
    }


}
