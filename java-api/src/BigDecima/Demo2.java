package BigDecima;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Demo2 {
    public static void main(String[] args) {
//
//        BigDecimal b1=BigDecimal.valueOf(10.0);
//        BigDecimal b2=BigDecimal.valueOf(10.0);
//        BigDecimal b3 = b1.add(b2);
//        System.out.println(b3);
//

        BigDecimal b1=BigDecimal.valueOf(10.0);
        BigDecimal b2=BigDecimal.valueOf(3.0);
        System.out.println(b1.divide(b2,3, RoundingMode.HALF_UP));
    }
}
