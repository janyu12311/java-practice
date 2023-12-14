package StringJoinerDemo1;

public class StringPractice2 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";
        boolean b = check(strA, strB);
        if(b){
            System.out.println("可以");

        }
        else{
            System.out.println("不可以");
        }

    }

    //翻转字符串
    public static String rotate(String str){
        char tmp=str.charAt(0);
        String end=str.substring(1);
        StringBuilder sb=new StringBuilder(end).append(tmp);
        return sb.toString();
    }
    //判断字符串是否相等
    public static boolean checkSame(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    public static boolean check(String strA,String strB){
        String sb=new StringBuilder(strA).append(strA).toString();
        int tmp=sb.indexOf(strB);
        if(tmp==-1){
            return false;
        }
        else {
            return true;
        }
    }

}
