import java.util.LinkedList;

public class 与或异或 {
    static int[][] num;
    static int count = 0;

    static public int cal(int[][] op) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                switch (op[i][j]) {
                    case 1:
                        num[i + 1][j] = num[i][j] & num[i][j + 1];
                        break;
                    case 2:
                        num[i + 1][j] = num[i][j] | num[i][j + 1];
                        break;
                    case 3:
                        num[i + 1][j] = num[i][j] ^ num[i][j + 1];
                        break;
                    default:
                        break;
                }
            }
        }
        return num[4][0];
    }

    static void dfs(int[][] op, int level, int pos) {
        if (level == 4) {
            int cal1 = cal(op);
            if (cal1 == 1) {
                count++;
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            op[level][pos] = i;
            if (pos + 1 < 4 - level) {
                dfs(op, level, pos + 1);
            } else {
                dfs(op, level + 1, 0);
            }
        }
    }

    public static void main(String[] args) {
        num = new int[5][5];
        num[0][0] = 1;
        num[0][1] = 0;
        num[0][2] = 1;
        num[0][3] = 0;
        num[0][4] = 1;
        int[][] op = new int[4][4];
        dfs(op, 0, 0);
        System.out.println(count);
    }
}