package Math;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(2));

    }


    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
              if(num%i==0){
                  return false;
              }
        }
        return true;
    }
}
