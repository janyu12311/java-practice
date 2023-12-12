package Text3;

public class GoodText {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];

        Goods g1=new Goods("123456","原神",648.8,648);
        Goods g2=new Goods("456123","明日方舟",328.8,328);
        Goods g3=new Goods("141526","崩铁" ,128.8,128);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    arr[i].getId()+","+
                    arr[i].getName()+","+
                    arr[i].getPrice()+","+
                    arr[i].getCount());
        }



    }
}
