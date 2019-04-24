import java.util.Scanner;

public class Baseball {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int bases[] = {s.nextInt(), s.nextInt() == 1 ? 2 : 0, s.nextInt() == 1 ? 3 : 0};
        int run = s.nextInt();
        int tot = 0;
        int b2[] = {0, 0, 0};
        if (run > 3) ++tot;
        else if (run == 1 || run == 2 || run == 3) b2[run - 1] = 1;
        for (int i = 0; i < 3; ++i) {
            bases[i]+=run;
            // System.out.println(bases[i]);
            if (bases[i] > 3) ++tot;
            else if (bases[i] == 1 || bases[i] == 2 || bases[i] == 3) b2[bases[i] - 1] = 1;
        }
        // System.out.println("ANSFJWIG");
        for (int i = 0; i < 3; ++i) System.out.println(b2[i]);
        System.out.println(tot);



    }
}