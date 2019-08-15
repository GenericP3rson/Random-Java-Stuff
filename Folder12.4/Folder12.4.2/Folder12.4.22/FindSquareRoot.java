import java.util.*;

public class FindSquareRoot {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("The program will find the square root of a number\nEnter a positive integer");
        int n = s.nextInt();
        float nextGuess = n, lastGuess = n;
        int it = 0;
        // nextGuess = (lastGuess + n / lastGuess) / 2;
        for (int i = 0; i < n; ++i) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
            ++it;
            if (Math.abs(lastGuess-nextGuess) < 0.000001) break;
        }
        // do {lastGuess = nextGuess; nextGuess = (lastGuess + n / lastGuess) / 2; System.out.println(nextGuess + " " + lastGuess); ++it;}
        // while (lastGuess-nextGuess < 0.000001);
        System.out.println("The square root of "+n+" is " + nextGuess);
        System.out.println("The program found the result in "+it+" iterations");

    }
}