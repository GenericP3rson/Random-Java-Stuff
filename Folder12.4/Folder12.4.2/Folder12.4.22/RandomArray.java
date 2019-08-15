public class RandomArray {
    public static void main(String args[]) {
        int ran[] = new int[100];
        for (int i = 0; i < ran.length; ++i) ran[i] = (int)(Math.random()*100);
        System.out.println("The random array generated is: ");
        int q = 0;
        for (int i = 0; i<10; ++i){
        for (int j = 0; j < 10; ++j) {System.out.print(ran[q] + " ");++q;}System.out.println("");}
        float mean = 0;
        for (int i : ran) mean+=i;
        System.out.println("The average of the values in the random array is " + mean/ran.length);
        int above = 0, below = 0, equ = 0, r;
        for (int i : ran) r = (i > mean/ran.length ? ++above : (i < mean / ran.length ? ++below : ++equ));
        System.out.println("There are "+ above +" numbers above average");
        System.out.println("There are " + below + " numbers below average");
    }
}