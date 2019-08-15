import java.util.*;

public class PowersOfTwo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = s.nextInt();
        for (int i = 0; i <= num; ++i) System.out.println(i + " " +(int)(Math.pow(2, i)));
    }
}