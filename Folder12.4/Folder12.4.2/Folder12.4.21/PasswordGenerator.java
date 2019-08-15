import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many digits you like to use for a numeric password?");
        long sz = s.nextInt();
        // int[] p = new int[sz];
        System.out.println("Your password is ");
        // for (int i = 0; i < sz; ++i) p[i] = (char)((int)(Math.random()*10));
        for (int i = 0; i < sz; ++i) System.out.print((int)(Math.random()*10));
        System.out.println("");
    }
}