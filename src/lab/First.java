package lab;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sneha on 26-10-2017.
 */
public class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fact(n));
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
