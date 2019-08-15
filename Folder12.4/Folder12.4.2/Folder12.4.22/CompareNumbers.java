import java.util.*;


public class CompareNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int i1 = s.nextInt();
        System.out.print("Enter second integer: ");
        int i2 = s.nextInt();
        System.out.print("Enter third integer: ");
        int i3 = s.nextInt();
        System.out.println("Got the numbers " + i1 + ", " + i2 + " and " + i3);
        System.out.println("Largest is " + (i1 > i2 ? (i1 > i3 ? i1 : (i2 > i3 ? i2 : i3)) : (i2 > i3 ? i2 : (i1 > i3 ? i1 : i3))));
        System.out.println("Smallest is " + (i1 < i2 ? (i1 < i3 ? i1 : (i2 < i3 ? i2 : i3)) : (i2 < i3 ? i2 : (i1 < i3 ? i1 : i3))));
        System.out.println("Sum is " + (int)(i1+i2+i3));
        System.out.println("Product is " + (int)(i1*i2*i3));
        System.out.println("Average is " + (float) ((i1 + i2 + i3)/3));
    }
}