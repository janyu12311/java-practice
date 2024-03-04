public class L100237 {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        for(int j = 0; j<m; j++){
            for(int i = 1; i < n; i++){
                grid[i][j] = grid[i][j] + grid[i-1][j];
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            int tmp = 0;
            for(int j = 0; j<m; j++){
                tmp += grid[i][j];
                if(tmp <= k) ans++;
                else break;
            }
        }
        return ans;
    }
}
