public class Demo1 {
    public static void main(String[] args){
//        int[] arr={123,456,798};
        int[] arr=new int[]{123,456,789};
        String[] astring={"张三","李四","王五"};
        System.out.println(arr.length);
        System.out.println(astring.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
