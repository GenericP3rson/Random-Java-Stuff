import java.math.*;
import java.util.*;
public class PI {
    public static void main(String args[]) {
        BigDecimal pi = new BigDecimal("1");
        Scanner s = new Scanner(System.in);
        Boolean tf = true, verbose = s.nextBoolean();
        BigInteger num = new BigInteger("3");
        int place = 0;
        BigInteger t = new BigInteger(System.nanoTime()+""); 
        while (true) {
            if (verbose) System.out.println("Time == " + new BigInteger(System.nanoTime()+"").subtract(t) + " nanoseconds\nAt position " + place + ":");
            System.out.println(pi.multiply(new BigDecimal("4")));
            pi = pi.add(new BigDecimal((tf ? "-" : "") + "1").divide(new BigDecimal(num), MathContext.DECIMAL128));
            num = num.add(new BigInteger("2"));
            tf = !tf;
            ++place;
        }
    }
}