import java.util.*;

public class Distance {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("X1: ");
        float x1 = s.nextFloat();
        System.out.print("Y1: ");
        float y1 = s.nextFloat();
        System.out.print("X2: ");
        float x2 = s.nextFloat();
        System.out.print("Y2: ");
        float y2 = s.nextFloat();
        System.out.println("The distance is " + Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }
}