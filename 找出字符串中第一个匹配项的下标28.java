public class 找出字符串中第一个匹配项的下标28 {
    static int[] getIntNums(String str) {
        if (str.length() == 1)
            return new int[] { -1 };

        char[] chs = str.toCharArray();
        int[] out = new int[chs.length];
        out[0] = -1;
        out[1] = 0;
        int ch = 0;
        int i = 2;
        while (i < chs.length) {
            if (chs[i - 1] == chs[ch]) {
                out[i++] = ++ch;
            } else if (ch > 0) {
                ch = out[ch];
            } else {
                out[i++] = 0;
            }
        }
        return out;
    }

    static public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;
        int[] next = getIntNums(needle);
        int i1 = 0, i2 = 0;
        char[] zhu = haystack.toCharArray();
        char[] find = needle.toCharArray();
        while (i1 < zhu.length && i2 < find.length) {
            if (zhu[i1] == find[i2]) {
                i1++;
                i2++;
            } else if (i2 == 0)
                i1++;
            else {
                i2 = next[i2];
            }
        }
        return i2 == find.length ? i1 - i2 : -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));

    }
}
