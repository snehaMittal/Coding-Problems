package lab;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sneha on 26-10-2017.
 */
public class Second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        System.out.println(calc(n,r));
    }

    private static long calc(int n, int r) {

        BigInteger temp = fact(r).multiply(fact(n-r));
        BigInteger temp2 = fact(n).divide(temp);
        return 1 ;
    }
    private static BigInteger fact(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        while (n > 1){
            fact = fact.multiply(BigInteger.valueOf(n));
            n-- ;
        }
        return fact ;
    }
}
