
import java.io.IOException;

public class C1_11_2 {
    static double output = 0.0;
    static double zero = 0.000000;
    public static double f(double x) {
        double tmp = x * x * x * x * x - 15 * x * x * x * x + 85 * x * x * x - 225 * x * x + 274 * x - 121;
        if(tmp==zero) output = x;
        return tmp;
    }
    public static void main(String[] args) throws IOException {
        double left = 1.5;
        double right = 2.4;
        double mid = 0;
        while(right - left >= 0.0000001){
            mid = (left+right)/2.0;
            if(f(mid) >0){
                left = mid;
            }else{
                right = mid;
            }
        }
        System.out.printf("%.6f",mid);
    }
}
