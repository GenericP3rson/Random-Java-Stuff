import java.util.Scanner;

public class Binary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("SZ: ");
        int sz = s.nextInt();
        int arr[] = new int[sz];
        for (int i = 0; i < sz; ++i) arr[i] = s.nextInt();
        System.out.println("KEY: ");
        int key = s.nextInt();
        System.out.println(recu(arr, key));
    }
    public static int recu(int[] um, int key) {
        int arr[] = new int[Math.round(um.length/2)];
        if (um[Math.round(um.length/2)] < key) for (int i =0; i < Math.round(um.length/2); ++i) arr[i] = um[i];
        else if (um[Math.round(um.length/2)] > key) for (int i = Math.round(um.length/2)+1; i < Math.round(um.length/2); ++i) arr[i - Math.round(um.length/2)+1] = um[i];
        else return Math.round(um.length/2);
        return recu(arr, key);
    }
}