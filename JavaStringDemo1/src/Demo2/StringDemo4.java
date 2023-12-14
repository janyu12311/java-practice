package Demo2;

public class StringDemo4 {
    public static void main(String[] args) {
        String id="411723200405081510";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        char gender=id.charAt(16);
        int num=gender-'0';
        if (num % 2 == 0) {
            System.out.println("是女生");
        }
        else{
            System.out.println("是男生");
        }
    }
}
