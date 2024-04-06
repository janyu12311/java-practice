import java.util.*;

public class P1241括号序列 {
    static int[] w;
    static char[] lefts;
    static char[] rights;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] strChar = sc.nextLine().toCharArray();
        int len = strChar.length;
        w = new int[len];
        lefts = new char[len];
        rights = new char[len];
        int top = 0;
        for (int i = 0; i < len; i++) {
            if (strChar[i] == '(') {
                w[top++] = i;
                lefts[i] = '(';
                rights[i] = ')';
            }
            if (strChar[i] == '[') {
                w[top++] = i;
                lefts[i] = '[';
                rights[i] = ']';
            }
            if (strChar[i] == ')') {
                if (top != 0&&strChar[w[top - 1]] == '(') {
                    rights[w[top - 1]] = ' ';
                    lefts[i] = ' ';
                    rights[i] = ')';
                    top--;
                }else{
                    rights[i] = ')';
                    lefts[i] = '(';
                }
            }
            if (strChar[i] == ']') {
                if (top != 0&&strChar[w[top - 1]] == '[') {
                    rights[w[top - 1]] = ' ';
                    lefts[i] = ' ';
                    rights[i] = ']';
                    top--;
                }else{
                    rights[i] = ']';
                    lefts[i] = '[';
                }
            }
        }
        for(int i = 0; i<len; i++){
            if(lefts[i] != ' ')System.out.print(lefts[i]);
            if(rights[i] != ' ')System.out.print(rights[i]);
        }
    }
}
