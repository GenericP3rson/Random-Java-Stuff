import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a year that would be determined if it is leap or not");
            int year = s.nextInt();
            System.out.println("Year " + year + " is"+ ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? " " : " not ") + "a leap year");
        }
    }
}