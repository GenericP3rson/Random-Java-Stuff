import java.util.Scanner;
import java.util.ArrayList;

public class GPS {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sz = s.nextInt();
        String[] bo = new String[sz];
        String[] ar = new String[sz];
        for (int i = 0; i < sz; ++i) {bo[i] = s.next();}
        // for (String hi : bo) System.out.println(hi);
        for (String hi : bo) ar = (zeros(hi.split("")));
    }
    public static ArrayList<Integer> zeros(String[] ok) {
        // for (String i : ok) System.out.println(i);
        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < ok.length; ++i) if (ok[i].equals("0")) r.add(i);
        return r;
    }
}
