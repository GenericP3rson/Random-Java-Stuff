import java.util.Scanner;

public class Long {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sz = s.nextInt();
        String num[] = Integer.toString(s.nextInt()).split("");
        String fin = "";
        int[] key = new int[9];
        for (int i = 0; i < 9; ++i) key[i] = s.nextInt();
        for (int i = 0; i < sz; ++i) fin+=key[Integer.parseInt(num[i]) - 1] > Integer.parseInt(num[i]) ? Integer.toString(key[Integer.parseInt(num[i]) -1]) : num[i];
        System.out.println(fin);
    }
}