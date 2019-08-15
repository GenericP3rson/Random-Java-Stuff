import java.math.BigInteger;
public class RiceChessboard {
    public static void main(String args[]) {
        BigInteger num = new BigInteger("1");
        for (int i = 0; i < 64; ++i) {
            // System.out.println(Math.pow(2, i) + " rice on square " + (int)((int)(i)+1));
            System.out.println(num + " rice on square " + (int) ((int) (i) + 1));
            num = num.add(num);
        }
    }
}