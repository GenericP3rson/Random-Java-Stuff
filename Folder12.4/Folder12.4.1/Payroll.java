import java.util.*;
public class Payroll {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = s.next();
        System.out.println("How many hours do you work?");
        float hrs = s.nextFloat();
        System.out.println("What's your hourly pay rate?");
        float hpr = s.nextFloat();
        System.out.println("Hello " + name + ", your weekly gross payment is $" + hrs*hpr + ".");
    }
}