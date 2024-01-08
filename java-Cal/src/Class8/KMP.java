package Class8;

public class KMP {
    public static int getIndexOf(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int i1 = 0;
        int i2 = 0;
        int[] next =getNextArray(str2);
        while (i1 < s1.length() && i2 < s2.length()) {
            if (str1[i1] == str2[i2]) {
                i1++;
                i2++;
            } else if (i2 == 0) {
                i1++;
            } else {
                i2 = next[i2];
            }
        }
        return i1 == i2 ? i1 - i2 : -1;
    }
    public static int[] getNextArray(char[] ms){
        if(ms.length==1){
            return new int[] {-1};
        }
        int[] next=new int[ms.length];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int cn=0;
        while(i<ms.length) {
            if (ms[i - 1] == ms[cn]) {
                next[i++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }



}
