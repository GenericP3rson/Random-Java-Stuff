import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Node {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String stuff = s.nextLine();
        String[] so = stuff.split("\\(|\\)");
        String[] ok = stuff.split("");
        // System.out.println(ok.length);
        ArrayList<String> max = new ArrayList<String>();
        ArrayList<String> z = new ArrayList<String>();
        int i = 0;
        for (String sc:so) {
            // System.out.println(sc);
            // System.out.println(sc.length());
            if (i == 0){
                i+=sc.length()+ 1; 
                max.add(sc);
                z.add(sc);
                continue;
            }
            i+=sc.length();
            // System.out.println(i);
            // System.out.println(ok[i]);
            // System.out.println(ok[i].equals("("));
            Boolean j = true;
            while (ok[i].equals("(") || ok[i].equals(")")) {
                // System.out.println(sc);
                // System.out.println(j);
                if (j) {z.add(sc); j = false;}
                // if (ok[i].equals("(")) {if (j) z.add(sc);}
                if (z.size() > max.size()) {
                    max.clear();
                    for (String q : z)
                        max.add(q);
                }
                if (ok[i].equals(")")) {
                    // if (j) z.add(sc);
                    // System.out.println(j);
                    z.remove(z.size() - 1);
                }
                // System.out.println("Z");
                // for (String fine : z)
                //     System.out.println(fine);
                // System.out.println("X");
                ++i;
                if (i >= ok.length) break;
            }
        }
        // System.out.println("FINAL");
        // for (String fine : max) System.out.println(fine);
        System.out.println(String.join(" ", max));
    }
}