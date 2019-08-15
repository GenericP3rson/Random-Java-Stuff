import java.util.Scanner;

public class RPS {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int ans, player;
        while (true) {
            ans = (int) (Math.random() * 3);
            System.out.println("Enter 0, 1, or 2");
            System.out.println("scissors (0), rock (1), paper (2):");
            player = s.nextInt();
            if (ans == player) {
                System.out.println("Tie");
            } else {
                if (player == 0){
                    System.out.println((ans == 1 ? "You lose: Rock beats scissors" : "You won: Scissors beats paper"));
                } else if (player ==1) {
                    System.out.println((ans == 2 ? "You lose: Paper beats rock" : "You won: Rock beats scissors"));
                } else if (player ==2) {
                    System.out.println((ans == 0 ? "You lose: Scissors beats paper" : "You won: Paper beats rock"));
                } else {
                    System.out.println("ERROR");
                }
            }
        }
    }
}