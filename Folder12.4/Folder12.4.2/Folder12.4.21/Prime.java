import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number. The System will find all the prime number smaller than this number.");
        long lim = s.nextInt(), num = 0, t = System.currentTimeMillis();
        for (int i = 0 ; i < lim; ++i) if (isPrime(i)) {System.out.println(i); ++num;}
        System.out.println("There are a total of " + num + " prime numbers");
        System.out.println("It took " + (System.currentTimeMillis() - t) + " ms");
    }
    public static Boolean isPrime(int x) {
        if (x < 2) return false;
        if (x==2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(x); i+=2) if (x % i == 0) return false;
        return true;
    }
}