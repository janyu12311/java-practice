public class 马虎的算式 {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int l = 1; l <= 9; l++) {
                    for (int p = 1; p <= 9; p++) {
                        for (int e = 1; e <= 9; e++) {
                            if(i == j || i == l || i == p || i == e
                             ||j == l || j == p || j == e
                             ||l == p || l == e || e == p)continue;
                             if( ((i*10+j) * (l*100+p*10+e)) == ((i*100+p*10+j) * (l*10+e)) ) ans ++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}