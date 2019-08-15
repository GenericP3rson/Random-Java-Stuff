import java.util.*;

public class HarmonicNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            float max = 0;
            System.out.println("Enter an integer");
            int x = s.nextInt();
            for (int i = 1; i <= x; ++i){ max+=(1/(float)(i));}
            System.out.println("The " + x + "th harmonic number " + max);
        }
    }
}