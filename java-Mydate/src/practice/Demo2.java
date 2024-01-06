package practice;

public class Demo2 {
    public static void main(String[] args) {
        int num=0;
        String s="1234789";
        if(s.matches("[1-9]\\d{0,9}")){
            for (int i = 0; i < s.length(); i++) {
                num=num*10+(s.charAt(i)-'0');
            }
            System.out.println(num);
        }else{
            System.out.println("输入错误");
        }

    }
}
