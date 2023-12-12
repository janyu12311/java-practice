package Text6;

public class PhoneText {
    public static void main(String[] args) {
        Phone[] arr=new Phone[3];
        Phone p1=new Phone("华为",8888,"红色");
        Phone p2=new Phone("小米",1999,"白色");
        Phone p3=new Phone("红米",1288,"白色");
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getPrice();
        }
        double op=1.0*sum/arr.length;
        System.out.println("价格为"+op);
    }
}
