import java.util.Scanner;
import java.math.BigInteger;

public class Stairs {
    public static final double PHI = (Math.sqrt(5) + 1) / 2;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int c = 0; c < cases; ++c) {
            int stairs = s.nextInt();
            // System.out.println(Math.round(fib(stairs)) + Math.round(fib(stairs-1)));
            // BigInteger a = new
            // BigInteger(Integer.toString((int)(Math.round(fib(stairs)))));
            // BigInteger b = new BigInteger(Integer.toString((int)
            // (Math.round(fib(stairs-1)))));
            // System.out.println(Math.round(fib(stairs)));
            // System.out.println(Math.round(fib(stairs-1)));
            // System.out.println(a.add(b));
            // long a = fib(stairs);
            // long b = fib(stairs-1);
            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(a+b);
            // System.out.println(fib(stairs).add(fib(stairs-1)));
            // System.out.println((fib(new BigInteger("0"), new BigInteger("1"), 0,
            // stairs-1)).add(fib(new BigInteger("0"), new BigInteger("1"), 0, stairs)));
            System.out.println(fib(new BigInteger("0"), new BigInteger("1"), 0, stairs));
        }
    }

    // public static long fib(int n) {
    // return ((long) (Math.round((Math.pow(PHI, n) - (Math.pow(-PHI, -n))) /
    // Math.sqrt(5))));
    // }
    // public static BigInteger fib(int n) {
    // return new BigInteger("" + (Math.round((Math.pow(PHI, n) - (Math.pow(-PHI,
    // -n))) / Math.sqrt(5))));
    // }
    public static BigInteger fib(BigInteger p1, BigInteger p2, int i, int n) {
        return (i == n ? p2 : fib(p2, p1.add(p2), i + 1, n));
    }
}

// import java.util.Scanner;
// import java.math.BigInteger;

// public class Main {
// public static void main(String args[]) {
// Scanner s = new Scanner(System.in);
// int cases = s.nextInt(), stairs;
// for (int i = 0; i < cases; ++i) {
// stairs = s.nextInt();
// // if (stairs % 2 == 0) {
// // int permutations = stairs/2 + 1;
// // // System.out.println(combo(4, 1));
// // int ans = 0;
// // for (int j = 0 ; j < permutations; ++j) {
// // // System.out.println(combo(2*j, permutations-j-1));
// // ans+=combo(2*j, permutations-j-1);
// // }
// // System.out.println(ans);
// // } else {
// int ans = 0;
// for (int j = stairs, num = 0; j >= 0; j-=2, ++num) {
// ans+=combo(j, num);
// }
// System.out.println(ans);
// // }
// }
// // System.out.println("HELLO");
// // System.out.println(fact(10));
// }
// // public static int combo(int iO1, int iO2) {
// // int total = iO1 + iO2;
// // // Equation: total! / (iO1! * iO2!);
// // return fact(total) / (fact(iO1) * fact(iO2));
// // }
// // public static int fact(int i) {
// // int q = 1;
// // for (int j = 2; j<= i; ++j) q*=j;
// // return q;
// // }
// public static int combo(int iO1, int iO2) {
// int total = iO1 + iO2;
// // Equation: total! / (iO1! * iO2!);
// return (fact(total).divide((fact(iO1).multiply(fact(iO2))))).intValue();
// }
// public static BigInteger fact(int i) {
// BigInteger q = new BigInteger("1");
// for (int j = 2; j <= i; ++j)
// q = q.multiply(new BigInteger(Integer.toString(j)));
// return q;
// }
// }