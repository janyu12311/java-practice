package Demo2;

public class StringDemo1 {
    public static void main(String[] args) {
          int[] arr={1,2,3};
        String str = arrToNewArr(arr);
        System.out.println(str);
        String reverser = reverser(str);
        System.out.println(reverser);
    }

    //写一个把整形数组拼接成字符串的函数
    public static String arrToNewArr(int[] arr){
        if(arr==null){
            return "";
        }
        else if(arr.length==0){
            return "[]";
        }
        else{
            String result="[";
            for (int i = 0; i < arr.length; i++) {
                if(i==arr.length-1){
                    result=result+arr[i]+"]";
                }
                else{
                    result=result+arr[i]+",";
                }

            }
            return result;
        }
    }
    //将一个字符串倒转
    public static String reverser(String str){
      String result="";
        for (int i =  str.length()-1; i >=0; i--) {
            result=result+str.charAt(i);
        }
        return result;
    }

}
