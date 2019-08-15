import java.util.*;
public class ComputeFutureValue {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double inAm = s.nextDouble(), annualInterest = s.nextDouble(), years = s.nextDouble();
        // double ans = inAm * Math.pow((annualInterest*1.01), years);
        double inVal = inAm * Math.pow((1 + annualInterest/1200), years*12);
        System.out.println(Math.floor(inVal*100)/100);
    }
}