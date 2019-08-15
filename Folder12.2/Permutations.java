import java.util.*;

public class Permutations {
    public static ArrayList<String> ok = new ArrayList();
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int count = 0; count < num; ++count) {
            String[] per = s.next().split("");
            System.out.println(String.join("", per));
            ok.add(String.join("", per));
            go3(per, 0, String.join("", per));
            // try {go4(per, 0, 0, fact(per.length), false);} catch (Exception e) {}
            System.out.println(ok.size());
            System.out.println(fact(per.length));
            ok.clear();
        }
    }
    public static void go2(String[] go, int i, String start) {
        String hold = go[i];
        String hold2 = go[go.length-1];
        go[i] = hold2;
        go[go.length-1] = hold;
        if (!start.equals(String.join("", go))){
            if (!seen(String.join("", go))) {System.out.println(String.join("", go));
            ok.add(String.join("", go));}
            i = i+1 >= go.length ? 0 : i+1;
            go2(go, i, start);
        }
    }

    public static void go3(String[] go, int i, String start) {
        String hold = go[i];
        String hold2 = go[i+1];
        go[i] = hold2;
        go[i+1] = hold;
        if (!start.equals(String.join("", go))) {
            // if (!seen(String.join("", go))) {
                System.out.println(String.join("", go));
                ok.add(String.join("", go));
            // }
            i = i + 1 >= go.length-1 ? 0 : i + 1;
            go3(go, i, start);
        }
    }
    public static void go4(String[] go, int i, int q, int j, boolean random) {
        String hold = go[i];
        String hold2 = go[i + 1];
        go[i] = hold2;
        go[i + 1] = hold;
        if (q != j) {
            boolean gotcha = true;
            if (!seen(String.join("", go))) {
                gotcha = false;
                System.out.println(String.join("", go));
                ok.add(String.join("", go));
            } 
            i = i + 1 >= go.length - 1 ? 0 : i + 1;
            System.out.println(gotcha);
            go4(go, i, q + (gotcha ? 0 : 1), j, random);
            // else {
            //     i = i + 1 >= go.length - 1 ? 0 : i + 1;
            //     try {go4(go, i, q, j, !random);} catch (Exception e) {}
            // }
        } else {System.out.println("NUM: "+ q + " " + j);}
    }
    public static boolean seen(String y) {
        boolean saw = false;
        for (String x : ok) if (x.equals(y)) saw = true;
        return saw; 
    }
    public static int fact(long w) {
        int x = 1;
        for (long i = 1; i <= w; ++i) x*=i;
        return x;
    }
}
