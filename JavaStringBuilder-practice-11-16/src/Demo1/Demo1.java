package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abc");
        sb.append(1);
        sb.append(1.25);
        sb.append("原神");
        sb.reverse();
        System.out.println(sb);
//        int length = sb.length();
        String str=sb.toString();
        System.out.println(sb);

    }
}
