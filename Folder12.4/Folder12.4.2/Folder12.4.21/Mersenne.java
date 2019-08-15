import java.util.Scanner;

public class Mersenne {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number. The System will find all the Mersenne prime numbers smaller than this number.");
        long lim = s.nextInt(), num = 0;
        long t = System.currentTimeMillis();
        for (int i = 0; Math.pow(2, i)-1 < lim; ++i) {
            if (isPrime(Math.pow(2, i)-1)) {System.out.println((int)(Math.pow(2, i)-1)); ++num;}
        } 
        System.out.println("There are a total of " + num + " Mersenne prime numbers");
        System.out.println("Excecuted in " + (System.currentTimeMillis() - t) + " ms");
    }
    
    public static Boolean isPrime(double x) {
        if (x < 2)
            return false;
        if (x == 2)
            return true;
        if (x % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(x); i += 2)
            if (x % i == 0)
                return false;
        return true;
    }
}