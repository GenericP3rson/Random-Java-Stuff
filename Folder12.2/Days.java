import java.utils.Scanner;
public class Days {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int prob = s.nextInt(), 
        days = s.nextInt(),
        startMin = 1,
        startMax = Math.trunc(Math.pow(prob, (1/days))) - 1;
        for (int i = startMin; i <= startMax; ++i) {
            for (int j = 0; j < 2*i; ++j) {
                int sum;
                if (sum < prob) continue;
                else if (sum == prob) break;
            }
        }
    }
}