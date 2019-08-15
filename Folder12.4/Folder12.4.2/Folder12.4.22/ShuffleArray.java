import java.util.*;

public class ShuffleArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a series of 5 numbers");
        int num[] = new int[5];
        for (int i= 0; i < num.length; ++i) {System.out.print("Enter number " + (int)(i+1) + ": " ); num[i] = s.nextInt();}
        System.out.println("Here are the numbers that you entered:[" + num[0] +", " + num[1] + ", " + num[2] + ", "
                + num[3] + ", " + num[4] + "]");
        num = shuffle(num);
        System.out.println("Here are the randomly shuffled numbers:[" + num[0] +", " + num[1] + ", " + num[2] + ", "
                + num[3] + ", " + num[4] + "]");
    }
    public static int[] shuffle(int ok[]) {
        int j[] = new int[5];
        for (int i = 0; i < ok.length; ++i) j[i] = ok[i];
        for (int i = 0; i < ok.length; ++i) {
            int spot = j[i];
            int h = (int)(Math.random()*j.length);
            j[i] = j[h];
            j[h] = spot;
            // System.out.println(i + " " + h);
        }
        return j;
    }
}