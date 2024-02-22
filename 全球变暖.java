import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 全球变暖 {

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static char[][] map;
    static boolean[][] dp;
    static int ans = 0, n;

    static class Node {
        int ni, nj;

        public Node(int ni, int nj) {
            this.ni = ni;
            this.nj = nj;
        }

    }

    public static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        dp[x][y] = true;
        boolean isAdd = true;
        while (!queue.isEmpty()) {
            int res = 0;
            Node n1 = queue.poll();
            for (int i = 0; i < 4; i++) {
                int u = n1.ni + dx[i];
                int v = n1.nj + dy[i];
                if (u < 0 || u >= n || v < 0 || v >= n || map[u][v] != '#')continue;
                if (dp[u][v])
                    res++;
                else {
                    dp[u][v] = true;
                    queue.add(new Node(u, v));
                    res++;
                }
            }
            if (res == 4)
                isAdd = false;
        }
        if(isAdd)ans++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            map[i] = tmp.toCharArray();
        }
        dp = new boolean[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(map[i][j] == '#' && !dp[i][j]){
                    bfs(i, j);
                }
            }
        }
        System.out.println(ans);
    }
}
