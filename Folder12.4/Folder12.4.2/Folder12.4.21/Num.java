import java.util.Scanner;

public class Num {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = (int)(Math.random()*101);
        Boolean ans = false;
        int guess; 
        int ng = 0;
        while (!ans) {
            System.out.println("Enter your guess: ");
            guess = s.nextInt();
            if (guess != num){
                System.out.println("Your guess is too " + (guess < num ? "low": "high"));
                ++ng;
            } else {
                System.out.println("Yes, the number is " + num + "\nYou guessed the correct number in " + (++ng) + " guesses");
                ans = true;
                break;
            }
        }
    }
}