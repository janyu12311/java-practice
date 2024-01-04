package clone;

import java.util.Objects;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        User u1=new User(1,"原神","132","oK",data);
        int[] arr=u1.getData();
        Object u2=(User)u1.clone();
        arr[0]=100;
        System.out.println(u1);
        System.out.println(u2);


    }
}
