import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int c = 0; c < cases; ++c) {
            int stairs = s.nextInt();
            System.out.println(fib(new BigInteger("0"), new BigInteger("1"), 0, stairs));
        }
        s.close();
    }
    public static BigInteger fib(BigInteger p1, BigInteger p2, int i, int n) {
        return (i == n ? p2 : fib(p2, p1.add(p2), i+1, n));
    }
}