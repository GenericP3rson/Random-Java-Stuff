import java.util.Scanner;
public class Seq {
    private static Integer go(int[] um, int start, int sz) {
        for (int i = start+1; i < sz; ++i) {
            if (um[i-1] > um[i]) {
                System.out.println(i + " " + um[i-1] + " " + um[i]);
                return i;
            }
        }
        return sz;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sz = s.nextInt();
        int[] stuff = new int[sz];
        for (int i = 0; i < sz; ++i) stuff[i] = s.nextInt();
        int max = 0, start = 0;
        for (int i = 0; sz > max; ++i) {
            // System.out.println(i + " " + stuff[i]);
            int q = go(stuff, i, sz);
            if (q > max) {
                max = q;
                start = i;
            }
            System.out.println(i  + " " + max);
            // max = q > max ? 1 : max;
        }
        System.out.println(max);
    }
}